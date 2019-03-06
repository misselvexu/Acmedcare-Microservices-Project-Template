package com.acmedcare.framework.microservices.template.bean;

import com.acmedcare.framework.microservices.template.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * {@link Account} Bean Defined
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {

  private static final long serialVersionUID = -6625478147696736439L;

  /** 代理主键 */
  private long pkid;

  /** 通行证账号 */
  private String passport;

  /** 用户名称 */
  private String username;

  /** 通行证密码 */
  private String password;

  /** 密码加密盐 */
  private String salt;

  /**
   * 账户状态
   *
   * <p>默认: 有效 {@link
   * com.acmedcare.framework.microservices.template.common.Constants.AccountStatus#ENABLED}
   *
   * @see com.acmedcare.framework.microservices.template.common.Constants.AccountStatus
   */
  private Constants.AccountStatus status = Constants.AccountStatus.ENABLED;

  /** 创建时间 */
  private Date createTime;

  /** 更新时间 */
  private Date upgradeTime;
}
