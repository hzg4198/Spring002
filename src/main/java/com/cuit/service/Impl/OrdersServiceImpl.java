package com.cuit.service.Impl;

import com.cuit.mapper.OrdersMapper;
import com.cuit.pojo.Orders;
import com.cuit.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
    private OrdersMapper ordersMapper;
    @Autowired
    public void SetOrdersMapper(OrdersMapper ordersMapper){
        this.ordersMapper = ordersMapper;
    }

    @Override
    public List<Orders> getAll() {
        return ordersMapper.getAll();
    }

    @Override
    public Orders getById(Integer id) {
        return ordersMapper.getById(id);
    }
}
