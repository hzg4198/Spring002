package com.cuit.mapper;

import com.cuit.pojo.User;
import com.cuit.vo.UserOrders;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into user (id, username, birthday, sex, address) VALUES " +
            "(null,#{username},now(),#{sex},#{address})")
    @SelectKey(keyColumn = "id",keyProperty = "id",before = false,resultType = Integer.class, statement = "select last_insert_id()")
    void save(User user);

    @Delete("DELETE from user where id=#{id}")
    int delete(int id);

    @Select("select * from user where id = #{id}")
    User getById(Integer id);

    @Select("select count(*) from user")
    int getTotalCount();

    @Select("select * from user")
    List<User> getAll();

    @Select("select * from user where username like CONCAT('%',#{name},'%')")
    List<User> queryByUserName(String name);

    List<User> queryByGenderAndName(User user);

    List<User> queryMultipleUserById(List<Integer> list);

    List<UserOrders> queryUserOrders();
}
