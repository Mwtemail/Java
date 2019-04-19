package com.rose.demo.service.impl;

import com.rose.demo.dao.DemoDAO;
import com.rose.demo.entity.DemoUser;
import com.rose.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoDAO demoDao;

    @Override
    public String testDemo() {
        List<DemoUser> userList = demoDao.getList();
        return userList.toString();
    }
}
