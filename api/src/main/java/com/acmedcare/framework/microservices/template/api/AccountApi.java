package com.acmedcare.framework.microservices.template.api;

import com.acmedcare.framework.microservices.template.bean.Account;
import com.acmedcare.framework.microservices.template.exception.ApiException;

/**
 * {@link AccountApi} Export Api Defined
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@SuppressWarnings("unused")
public interface AccountApi {

  /**
   * Query {@link Account} by passport
   *
   * @param passport passport
   * @return a instance of {@link Account}
   * @throws ApiException api invoked exception
   */
  Account queryAccount(String passport) throws ApiException;
}
