package com.cuit.service.Impl;


import com.cuit.mapper.UserMapper;
import com.cuit.pojo.User;
import com.cuit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Autowired
    public void SetUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }
    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    @Override
    public int getTotalCount() {
        return userMapper.getTotalCount();
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<User> queryByUserName(String name) {
        return userMapper.queryByUserName(name);
    }

    @Override
    public List<User> queryByGenderAndName(User user) {
        return userMapper.queryByGenderAndName(user);
    }
}
