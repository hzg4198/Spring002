package com.cuit.service;


import com.cuit.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestAccountService {

    @Autowired
    private AccountService accountService;

    @Test
    public void TestTransfer() {
        accountService.transfer(1,2, 1000.0);
    }

}
