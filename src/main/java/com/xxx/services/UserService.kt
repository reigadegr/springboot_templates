package com.xxx.services

import com.xxx.pojo.User

interface UserService {
    fun findByUserIdAndPassword(studentId: String, password: String): User?
}
