package com.example.airportmanage.service;
import com.example.airportmanage.bean.UserBean;
public interface UserService {
    UserBean login(String name,String password);
    Boolean register(String name,String password);
}
