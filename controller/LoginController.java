package com.example.airportmanage.controller;

import com.example.airportmanage.bean.UserBean;
import com.example.airportmanage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class LoginController {
    //将Service注入Web层
    @Resource
    UserService userService;

    //映射到web页面loginView.html
    @RequestMapping("/loginView")
    public String show(){return "loginView";}

    //映射到service层的login方法
    @RequestMapping(value = "/logintest",method = RequestMethod.POST)
    public String loginMethod(String name,String password){
        UserBean userBean = userService.login(name,password);
        if (userBean!=null)
            return "success";
        else
            return "error";
    }
}
