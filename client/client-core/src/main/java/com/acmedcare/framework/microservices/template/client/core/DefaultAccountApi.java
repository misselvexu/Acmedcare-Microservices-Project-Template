package com.acmedcare.framework.microservices.template.client.core;

import com.acmedcare.framework.microservices.template.api.AccountApi;
import com.acmedcare.framework.microservices.template.bean.Account;
import com.acmedcare.framework.microservices.template.exception.ApiException;

/**
 * An {@link DefaultAccountApi} Implements of {@link AccountApi}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 * @see Account
 * @see AccountApi
 */
@SuppressWarnings("unused")
public class DefaultAccountApi implements AccountApi {

  /**
   * Query {@link Account} by passport
   *
   * @param passport passport
   * @return a instance of {@link Account}
   * @throws ApiException api invoked exception
   */
  @Override
  public Account queryAccount(String passport) throws ApiException {

    // TODO do account query biz

    throw new ApiException("Un-implements biz code.");
  }
}
