package com.cuit.service;


import com.cuit.config.SpringConfig;
import com.cuit.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestUserService {

    private UserService userService;
    @Autowired
    public void SetUserService(UserService userService){
        this.userService = userService;
    }

    @Test
    public void TestGetAll(){
        List<User> all = userService.getAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    public void TestDelete(){
        int delete = userService.delete(46);
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
}
