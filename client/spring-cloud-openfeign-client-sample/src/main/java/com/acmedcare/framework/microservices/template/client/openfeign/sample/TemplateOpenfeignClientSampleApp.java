package com.acmedcare.framework.microservices.template.client.openfeign.sample;

import com.acmedcare.framework.microservices.template.client.openfeign.TemplateApiClient;
import com.acmedcare.framework.microservices.template.response.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link TemplateOpenfeignClientSampleApp}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-04-01.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {TemplateApiClient.class})
public class TemplateOpenfeignClientSampleApp {

  public static void main(String[] args) {
    // new application
    new SpringApplicationBuilder()
        .sources(TemplateOpenfeignClientSampleApp.class)

        // default properties
        .properties("spring.profiles.active=nacos")
        .web(WebApplicationType.SERVLET)
        .run(args);
  }

  @RestController
  @RequestMapping("/")
  public static class SampleController {

    private final TemplateApiClient templateApiClient;

    @Autowired
    public SampleController(TemplateApiClient templateApiClient) {
      this.templateApiClient = templateApiClient;
    }

    @GetMapping("/account/{passport}")
    ResponseEntity<AccountResponse> hello(@PathVariable String passport) {
      return this.templateApiClient.queryAccount(passport);
    }
  }
}
