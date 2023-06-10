package com.atguigu.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.mapper.AdminMapper;
import com.atguigu.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(interfaceClass = AdminService.class)
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;
    @Override
    @Transactional
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }
}
