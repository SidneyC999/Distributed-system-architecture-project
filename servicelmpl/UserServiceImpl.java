package com.example.airportmanage.servicelmpl;
import com.example.airportmanage.bean.UserBean;
import com.example.airportmanage.mapper.UserMapper;
import com.example.airportmanage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    @Resource
    private UserMapper userMapper;

    public UserBean login(String name,String password){
        UserBean userBean = userMapper.getInfo(name,password);
        System.out.println(userBean);
        return userBean;
    }

    public Boolean register(String name, String password,String phone) {
        return userMapper.setInfo(name,password,phone);
    }

    public UserBean isRegister(String phone) {
        return userMapper.getPhInfo(phone);
    }
}
