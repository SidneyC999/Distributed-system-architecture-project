package com.example.airportmanage.controller;

import com.example.airportmanage.bean.UserBean;
import com.example.airportmanage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
public class RegisterController {
    //将Service注入Web层
    @Resource
    UserService userService;

    //映射到web页面loginView.html
    @RequestMapping("/registerView")
    public String show(){return "registerView";}

    //映射到service层的register方法
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerMethod(String name,String password,String confirmPassword,String phone){
        if(password.equals(confirmPassword)){
//            UserBean userBean = new UserBean(id,name,password);
            userService.register(name,password,phone);
            return "login";
        }
        else{
            return "error";
        }
    }

    //ajax检测电话是否已注册
    @RequestMapping(value = "/isRegist",method=RequestMethod.POST)
    @ResponseBody
    public Boolean isRegister(@RequestBody Map map){//, HttpServletRequest request, HttpServletResponse response){
        String phone = map.get("phone").toString();
        UserBean userBean = userService.isRegister(phone);
//        System.out.println(userService.isRegister("7777"));
//        System.out.println(userBean);
        if (userBean==null) //未注册
            return false;
        else
            return true;
    }

//    @RequestMapping(value = "/tryRegist",method=RequestMethod.POST)
//    @ResponseBody
//    public String tryRegister(@RequestBody Map map){//, HttpServletRequest request, HttpServletResponse response){
//        String flag;
//        Object pw= map.get("password");
//        Object cpw=map.get("confirmPassword");
//        System.out.println("pw"+pw);
//        System.out.println("cpw"+cpw);
//        System.out.println("-----");
//        if(pw.equals(cpw)){
////            UserBean userBean = new UserBean(id,name,password);
//            flag = "true";
//        }
//        else{
//            flag = "false";
//        }
//        System.out.println(flag);
//        return flag;
//    }
}
