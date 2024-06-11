package com.xxx.mapper

import com.xxx.pojo.User
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {
    @Select("SELECT * FROM users WHERE student_id = #{student_id} AND password = #{password}")
    fun findByUserIdAndPassword(@Param("student_id") studentId: String, @Param("password") password: String): User?
}
