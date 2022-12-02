package com.example.airportmanage.controller;

import com.example.airportmanage.bean.FlightBean;
import com.example.airportmanage.bean.UserBean;
import com.example.airportmanage.service.FlightService;
import com.example.airportmanage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MainController {
    //将Service注入Web层
    @Resource
    FlightService flightService;

    //映射到web页面loginView.html
    @RequestMapping("/main")
    public String show(){return "main.html";}

    //映射到service层的showInfo方法
    @RequestMapping(value = "/showInfo",method = RequestMethod.POST)
    @ResponseBody
    public List<FlightBean> loginMethod(){
        List<FlightBean> list = flightService.print();
        return list;
    }

}
