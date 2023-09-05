package com.cuit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper {
    @Insert("insert into tbl_log(info,createDate) values (#{str},now())")
    void log(String str);
}
