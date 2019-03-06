package com.acmedcare.framework.microservices.template.endpoint;

import com.acmedcare.framework.exception.entity.EntityBody;
import com.acmedcare.framework.kits.StringUtils;
import com.acmedcare.framework.microservices.template.bean.Account;
import com.acmedcare.framework.microservices.template.common.exception.BizException;
import com.acmedcare.framework.microservices.template.common.log.LogDefined;
import com.acmedcare.framework.microservices.template.endpoint.exception.InvalidRequestParameterException;
import com.acmedcare.framework.microservices.template.endpoint.response.AccountResponse;
import com.acmedcare.framework.microservices.template.endpoint.service.AccountService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link AccountEndpoint} Defined
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@SuppressWarnings("unused")
@RestController
@Api(tags = "账户体系Api")
@RequestMapping("/account")
public class AccountEndpoint {

  private static final Logger log = LogDefined.accountLogger;

  /** {@link AccountService} instance inject */
  private final AccountService accountService;

  @Autowired
  public AccountEndpoint(AccountService accountService) {
    this.accountService = accountService;
  }

  /**
   * 根据用户账号查询用户详情
   *
   * @param passport 账号
   * @return 用户详情
   * @see com.acmedcare.framework.microservices.template.bean.Account
   */
  @ApiOperation(value = "查询用户详情", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @ApiResponses({
    @ApiResponse(code = 404, message = "用户不存在"),
    @ApiResponse(code = 500, message = "服务端异常")
  })
  @GetMapping(value = "/{passport}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  ResponseEntity<?> queryAccount(
      @ApiParam(value = "通行证账号", required = true) @PathVariable("passport") String passport) {

    try {

      log.info("请求获取用户详情, 请求参数:{} ", passport);

      // check params
      if (StringUtils.isBlank(passport)) {
        throw new InvalidRequestParameterException("请求参数['passport']不能为空");
      }

      // query account
      Account account = this.accountService.queryAccount(passport);

      if (account == null) {
        return ResponseEntity.notFound().build();
      }

      AccountResponse accountResponse = new AccountResponse(account);

      return ResponseEntity.ok(accountResponse);

    } catch (BizException e) {
      log.error("查询用户处理异常", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(EntityBody.exception(e));
    } catch (InvalidRequestParameterException e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(EntityBody.exception(e));
    } catch (Throwable e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(EntityBody.exception(e));
    }
  }
}
