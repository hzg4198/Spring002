package com.cuit.service.Impl;

import com.cuit.mapper.AccountMapper;
import com.cuit.service.AccountService;
import com.cuit.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@Transactional(rollbackFor = {IOException.class},isolation = Isolation.REPEATABLE_READ,readOnly = false,propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private LogService logService;


    @Transactional
    @Override
    public void transfer(Integer from, Integer to, Double money) {
        try {
            accountMapper.decreaseMoney(from,money);
            accountMapper.increaseMoney(to,money);
        }finally {
            logService.log(String.valueOf(from),String.valueOf(to),money);
        }

    }

}
