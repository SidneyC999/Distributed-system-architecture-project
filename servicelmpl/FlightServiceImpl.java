package com.example.airportmanage.servicelmpl;

import com.example.airportmanage.bean.FlightBean;
import com.example.airportmanage.mapper.FlightMapper;
import com.example.airportmanage.mapper.UserMapper;
import com.example.airportmanage.service.FlightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    //将DAO注入Service层
    @Resource
    private FlightMapper flightMapper;

    public List<FlightBean> print() {
        List<FlightBean> list = flightMapper.getInfo();
        return list;
    }
}
