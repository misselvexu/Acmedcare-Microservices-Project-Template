package com.acmedcare.framework.microservices.template.endpoint.response;

import com.acmedcare.framework.kits.BeanUtils;
import com.acmedcare.framework.kits.jackson.JacksonDateFormat;
import com.acmedcare.framework.microservices.template.bean.Account;
import com.acmedcare.framework.microservices.template.common.Constants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * AccountResponse
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@Getter
@Setter
@ApiModel("用户查询返回值")
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse implements Serializable {

  private static final long serialVersionUID = 7966948111148821592L;

  /** 代理主键 */
  @ApiModelProperty("通行证编号")
  private long pkid;

  /** 通行证账号 */
  @ApiModelProperty("通行证账号")
  private String passport;

  /** 用户名称 */
  @ApiModelProperty("姓名")
  private String username;

  /**
   * 账户状态
   *
   * <p>默认: 有效 {@link
   * com.acmedcare.framework.microservices.template.common.Constants.AccountStatus#ENABLED}
   *
   * @see com.acmedcare.framework.microservices.template.common.Constants.AccountStatus
   */
  @ApiModelProperty("账户状态")
  private Constants.AccountStatus status = Constants.AccountStatus.ENABLED;

  /** 创建时间 */
  @ApiModelProperty("创建时间")
  @JacksonDateFormat
  private Date createTime;

  /** 更新时间 */
  @ApiModelProperty(hidden = true)
  private Date upgradeTime;

  /**
   * Copy Properties From {@link Account} instance
   *
   * @param account source instance of {@link Account}
   */
  public AccountResponse(Account account) {
    BeanUtils.copyProperties(account, this);
  }
}
