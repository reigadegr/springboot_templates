package com.xxx.services

import com.xxx.pojo.User

interface UserService {
    fun findByUserIdAndPassword(userId: String, password: String): User?
}
