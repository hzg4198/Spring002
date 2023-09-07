package com.cuit.service;

import com.cuit.pojo.User;
import com.cuit.vo.UserOrders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    void save(User user);
    int delete(int id);
    User getById(Integer id);
    int getTotalCount();
    List<User> getAll();
    List<User> queryByUserName(String name);
    List<User> queryByGenderAndName(User user);
    List<User> queryMultipleUserById(List<Integer> list);
    List<UserOrders> queryUserOrders();

}
