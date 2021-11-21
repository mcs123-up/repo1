package com.lagou.service.impl;

import com.lagou.dao.AccountDao;
import com.lagou.domain.Account;
import com.lagou.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    //需要用到AccountDao的代理对象
    @Autowired
    private AccountDao accountDao;

    /*
        测试spring在ssm环境中的单独使用
     */
    public List<Account> findAll() {
        List<Account> all = accountDao.findAll();
        return all;
    }


    /*
        账户添加
     */

    public void save(Account account) {

        accountDao.save(account);

    }


    public Account findById(Integer id) {
        return accountDao.findById(id);
    }


    public void update(Account account) {
        accountDao.update(account);
    }


    public void deleteBatch(Integer[] ids) {
        accountDao.deleteBatch(ids);
    }
}
