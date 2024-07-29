package com.xxx.mapper;


import com.xxx.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where admin_id = #{admin_id} AND password = #{password}")
    Admin verifyLoginInfo(String admin_id, String password);
}
