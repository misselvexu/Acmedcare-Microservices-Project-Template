package com.acmedcare.framework.microservices.template.repository;

import com.acmedcare.framework.microservices.template.bean.Account;
import com.acmedcare.framework.microservices.template.common.exception.RepositoryException;

/**
 * {@link AccountRepository} Methods Defined
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@SuppressWarnings("unused")
public interface AccountRepository {

  /**
   * Query {@link Account} by passport
   *
   * @param passport passport
   * @return a instance of {@link Account}
   * @throws RepositoryException repository exception
   */
  Account queryAccount(String passport) throws RepositoryException;
}
