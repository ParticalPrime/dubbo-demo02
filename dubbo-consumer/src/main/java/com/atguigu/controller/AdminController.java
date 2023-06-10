package com.atguigu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.pojo.Admin;
import com.atguigu.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Reference(timeout = 30000)
    private AdminService adminService;

    @GetMapping
    public List<Admin> findAll(){
        return adminService.findAll();
    }
}
