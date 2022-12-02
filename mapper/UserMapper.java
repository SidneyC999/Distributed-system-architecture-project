package com.example.airportmanage.mapper;
import com.example.airportmanage.bean.UserBean;
public interface UserMapper {
    UserBean getInfo(String name,String password);
    Boolean setInfo(String name,String password,String phone);
    UserBean getPhInfo(String phone);
}
