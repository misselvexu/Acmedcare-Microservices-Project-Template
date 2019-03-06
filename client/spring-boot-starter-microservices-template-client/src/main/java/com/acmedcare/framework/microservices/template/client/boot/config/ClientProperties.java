package com.acmedcare.framework.microservices.template.client.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClientProperties
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@Data
@ConfigurationProperties(prefix = ClientProperties.CLIENT_PROPERTIES_PREFIX)
public class ClientProperties {

  public static final String CLIENT_PROPERTIES_PREFIX = "template.client";


  /**
   * // TODO  definal client config properties
   */

}
