package com.bdqn.service;

import com.bdqn.dao.StusinfoDao;
import com.bdqn.entity.Stusinfo;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stusinfoService")
public interface StusinfoService {

    public List<Stusinfo> findAll();

}
