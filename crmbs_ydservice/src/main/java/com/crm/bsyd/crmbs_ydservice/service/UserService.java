package com.crm.bsyd.crmbs_ydservice.service;

import com.crm.bsyd.crmbs_ydservice.entity.User;
import com.crm.bsyd.crmbs_ydservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
