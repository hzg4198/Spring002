package com.cuit.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface AccountMapper {
    @Update("update account set money = money + #{money} where id = #{id}")
    void increaseMoney(@Param("id") Integer id, @Param("money") Double money);
    @Update("update account set money = money - #{money} where id = #{id}")
    void decreaseMoney(@Param("id")Integer id,@Param("money")Double money);
}
