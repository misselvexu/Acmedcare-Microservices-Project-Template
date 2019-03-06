package com.acmedcare.framework.microservices.template.client.boot.autoconfigure;

import com.acmedcare.framework.microservices.template.client.boot.config.ClientProperties;
import com.acmedcare.framework.microservices.template.client.core.DefaultAccountApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * TemplateApiClientAutoConfiguration
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@ConditionalOnClass(DefaultAccountApi.class)
@Configuration
@EnableConfigurationProperties(ClientProperties.class)
public class TemplateApiClientAutoConfiguration {



}
