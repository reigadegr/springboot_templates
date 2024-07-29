package com.xxx.controller;

import com.xxx.pojo.Admin;
import com.xxx.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/verifyLogin/{admin_id}/{password}", method = RequestMethod.GET)
    public Admin verifyLoginInfo(@PathVariable String admin_id, @PathVariable String password) {
        return adminService.verifyLoginInfo(admin_id, password);
    }
}
