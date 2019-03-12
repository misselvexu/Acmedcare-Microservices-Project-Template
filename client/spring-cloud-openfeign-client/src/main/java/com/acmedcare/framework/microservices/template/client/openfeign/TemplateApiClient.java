package com.acmedcare.framework.microservices.template.client.openfeign;

import com.acmedcare.framework.microservices.template.client.openfeign.configuration.DefaultFeginConfiguration;
import com.acmedcare.framework.microservices.template.common.Constants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * TemplateApiClient
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@FeignClient(
    name = Constants.PROJECT_SERVICE_NAMESPACE,
    configuration = DefaultFeginConfiguration.class)
public interface TemplateApiClient {

  /**
   *
   * @param passport
   * @return
   */
  @GetMapping(value = "/{passport}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  ResponseEntity queryAccount(@PathVariable("passport") String passport);



}
