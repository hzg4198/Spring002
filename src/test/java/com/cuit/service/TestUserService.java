package com.cuit.service;


import com.cuit.config.SpringConfig;
import com.cuit.pojo.User;
import com.cuit.vo.UserOrders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestUserService {
    @Autowired
    private UserService userService;

    @Test
    public void TestGetAll(){
        List<User> all = userService.getAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    public void TestDelete(){
        int delete = userService.delete(10);
        System.out.println(delete);
    }

    @Test
    public void TestInsert(){
        User user = new User();
        user.setSex("男");
        user.setAddress("cuit");
        user.setUsername("hzg");
        userService.save(user);
        System.out.println(user);
    }

    @Test
    public void TestGetById(){
        User byId = userService.getById(45);
        System.out.println(byId);
    }

    @Test
    public void TestQueryByName(){
        List<User> list = userService.queryByUserName("王");
        for (User user : list) {
            System.out.println(user);

        }
    }

    @Test
    public void TestQueryByNameAndSex(){
        User user = new User();
        user.setUsername("王");
        List<User> list = userService.queryByGenderAndName(user);
        for (User user1 : list) {
            System.out.println(user1);
        }
    }

    @Test
    public void TestQueryMultipleUserById(){
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);
        List<User> list1 = userService.queryMultipleUserById(list);
        for (User user : list1) {
            System.out.println(user);
        }
    }


    @Test
    public void TestQueryUserOrders(){
       /* List<UserOrders> userOrders = userService.queryUserOrders();
        for (UserOrders userOrder : userOrders) {
            System.out.println(userOrder);
        }*/
    }
}
