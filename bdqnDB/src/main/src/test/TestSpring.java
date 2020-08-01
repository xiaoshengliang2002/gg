package test;


import com.bdqn.service.StusinfoService;
import javafx.application.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StusinfoService accountService = (StusinfoService) ac.getBean("stusinfoService");
        accountService.findAll();
    }

}
