package com.xxx.controller

import com.xxx.pojo.User
import com.xxx.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/uniselect")
class UserController {
    @Autowired
    private lateinit var userService: UserService

    @CrossOrigin(origins = ["*"])
    @RequestMapping("/login")
    fun findByUserIdAndPassword(@RequestBody user: User): User? {
        val studentId = user.student_id ?: ""
        val password = user.password ?: ""
        // println("学号：$studentId")
        // println("密码：$password")
        return userService.findByUserIdAndPassword(studentId, password)
    }
}
