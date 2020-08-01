package com.bdqn.controller;

import com.bdqn.dao.StusinfoDao;
import com.bdqn.entity.Stusinfo;
import com.bdqn.service.StusinfoService;
import com.bdqn.service.impl.StusinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bdqn")
public class StusinfoController {

    @Autowired
    private  StusinfoService stusinfoService;

    @RequestMapping("/Login")
    public String Login(Model m){
        System.out.println("查询成功");
        List<Stusinfo> stusinfo =  stusinfoService.findAll();
        m.addAttribute("stusinfo",stusinfo);
        return "success";
    }

}
