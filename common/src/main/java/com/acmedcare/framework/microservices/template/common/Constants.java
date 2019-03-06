package com.acmedcare.framework.microservices.template.common;

/**
 * {@link Constants} Defined
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@SuppressWarnings("unused")
public final class Constants {

  /**
   * 项目服务名称,用于注册到注册中心使用
   *
   * <p>
   */
  public static final String PROJECT_SERVICE_NAMESPACE = "Acmedcare-Microservice-Project-Template";

  /**
   * {@link AccountStatus} defined
   *
   * @since ${project.version}
   */
  public static enum AccountStatus {

    /** 有效账户状态 */
    ENABLED,

    /** 账户锁定状态 */
    LOCKED,

    /** 无效账户(注销状态) */
    DISABLED,
  }
}
