package com.acmedcare.framework.microservices.template.repository.jdbc;

import com.acmedcare.framework.microservices.template.bean.Account;
import com.acmedcare.framework.microservices.template.common.exception.RepositoryException;
import com.acmedcare.framework.microservices.template.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * AccountJDBCRepository
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@Repository
public class AccountJDBCRepository implements AccountRepository {

  @Autowired private JdbcTemplate jdbcTemplate;

  /**
   * Query {@link Account} by passport
   *
   * @param passport passport
   * @return a instance of {@link Account}
   */
  @Override
  public Account queryAccount(String passport) throws RepositoryException {

    // TODO query account

    return null;
  }
}
