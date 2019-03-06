package com.acmedcare.framework.microservices.template.endpoint.service;

import com.acmedcare.framework.microservices.template.bean.Account;
import com.acmedcare.framework.microservices.template.common.exception.BizException;
import com.acmedcare.framework.microservices.template.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AccountService
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019-03-06.
 */
@Service
public class AccountService {

  private final AccountRepository accountRepository;

  @Autowired
  public AccountService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  /**
   * Query Account Service
   *
   * @param passport passport
   * @return a instance of {@link Account}
   */
  public Account queryAccount(String passport) throws BizException {
    try {
      return this.accountRepository.queryAccount(passport);
    } catch (Exception e) {
      throw new BizException(e);
    }
  }
}
