package com.cuit.mapper;

import com.cuit.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into user (id, username, birthday, sex, address) VALUES " +
            "(null,#{username},now(),#{sex},#{address})")
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
}
