package com.xxx.controller

import com.xxx.pojo.User
import com.xxx.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
//@RequestMapping("/uniselect")
//若取消注释，则README.md的demo 需要做出调整: http://127.0.0.1:9090/login/1/1 -> http://127.0.0.1:9090/uniselect/login/1/1
//希望你可以理解，这个很简单
class UserController {
    @Autowired
    private lateinit var userService: UserService

    //CrossOrigin注解为允许接受其他端口的请求(如果是跨域请求，默认不同端口禁止通信。设置为*则为允许任意端口对此接口发起请求)
    @CrossOrigin(origins = ["*"])
    @RequestMapping(value = ["/login/{userId}/{password}"], method = [RequestMethod.GET])
    fun findByUserIdAndPassword(@PathVariable userId: String, @PathVariable password: String): User? {
        return userService.findByUserIdAndPassword(userId, password)
    }
}
