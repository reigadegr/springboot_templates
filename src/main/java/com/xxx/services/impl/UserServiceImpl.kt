package com.xxx.services.impl

import com.xxx.mapper.UserMapper
import com.xxx.pojo.User
import com.xxx.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    @Autowired
    private lateinit var userMapper: UserMapper

    override fun findByUserIdAndPassword(studentId: String, password: String): User? {
        return userMapper.findByUserIdAndPassword(studentId, password)
    }
}
