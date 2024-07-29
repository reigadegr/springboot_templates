package com.xxx.services;

import com.xxx.pojo.Admin;

public interface AdminService {
    Admin verifyLoginInfo(String admin_id, String password);
}
