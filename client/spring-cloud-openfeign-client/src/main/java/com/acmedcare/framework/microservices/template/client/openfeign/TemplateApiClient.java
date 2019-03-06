package com.acmedcare.framework.microservices.template.client.openfeign;

import com.acmedcare.framework.microservices.template.client.openfeign.configuration.DefaultFeginConfiguration;
import com.acmedcare.framework.microservices.template.common.Constants;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * TemplateApiClient
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@FeignClient(
    name = Constants.PROJECT_SERVICE_NAMESPACE,
    configuration = DefaultFeginConfiguration.class)
public final class TemplateApiClient {




}
