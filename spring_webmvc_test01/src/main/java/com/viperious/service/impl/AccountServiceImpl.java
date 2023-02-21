package com.viperious.service.impl;

import com.viperious.mapper.AccountMapper;
import com.viperious.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void transferMoney(String outAccount, String inAcount, Integer money) {
        accountMapper.decrMoney(outAccount,money);
//        int i = 1/0;
        accountMapper.incrMoney(inAcount,money);

    }

}
