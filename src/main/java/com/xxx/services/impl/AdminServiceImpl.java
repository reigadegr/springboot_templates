package com.xxx.services.impl;

import com.xxx.pojo.Admin;
import com.xxx.services.AdminService;
import com.xxx.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    //注入testmapper对象
    @Autowired
    private AdminMapper adminMapper;


    @Override
    public Admin verifyLoginInfo(String admin_id, String password) {
        //直接返回处理结果
        return adminMapper.verifyLoginInfo(admin_id,password);
    }
}
