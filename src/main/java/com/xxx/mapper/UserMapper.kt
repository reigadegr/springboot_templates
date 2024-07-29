package com.xxx.mapper

import com.xxx.pojo.User
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {
    @Select("SELECT * FROM users WHERE user_id = #{user_id} AND password = #{password}")
    fun findByUserIdAndPassword(@Param("user_id") userId: String, @Param("password") password: String): User?
}
