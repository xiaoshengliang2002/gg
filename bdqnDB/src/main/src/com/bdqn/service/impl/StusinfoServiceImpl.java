package com.bdqn.service.impl;

import com.bdqn.dao.StusinfoDao;
import com.bdqn.entity.Stusinfo;
import com.bdqn.service.StusinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class StusinfoServiceImpl implements StusinfoService {

    @Autowired
    private StusinfoDao stusinfoDao;

    @Override
    public List<Stusinfo> findAll() {
        System.out.println("业务层: 查询账户! ");
        return stusinfoDao.findAll();
    }
}
