package com.acmedcare.framework.microservices.template.repository.jdbc;

import com.acmedcare.framework.microservices.template.bean.Account;
import com.acmedcare.framework.microservices.template.common.Constants;
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

    String sql =
        "SELECT `pkid`, `passport`, `username`, `password`, `salt` , `status`, `create_time`, `upgrade_time` FROM `acmedcare_account` WHERE `passport` = ? LIMIT 1";
    return this.jdbcTemplate.queryForObject(
        sql,
        (rs, rowNum) ->
            Account.builder()
                .pkid(rs.getLong("pkid"))
                .passport(rs.getString("passport"))
                .password(rs.getString("password"))
                .username(rs.getString("username"))
                .salt(rs.getString("salt"))
                .status(Constants.AccountStatus.valueOf(rs.getString("status")))
                .createTime(rs.getDate("create_time"))
                .upgradeTime(rs.getDate("upgrade_time"))
                .build(),
        passport);
  }
}
