package com.cuit.service;


import com.cuit.config.SpringConfig;
import com.cuit.pojo.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestOrdersService {
    @Autowired
    private OrdersService ordersService;

    @Test
    public void TestGetAll(){
        List<Orders> all = ordersService.getAll();
        for (Orders orders : all) {
            System.out.println(orders);
        }
    }

    @Test
    public void TestGetById(){
        Orders byId = ordersService.getById(5);
        System.out.println(byId);
    }
}
