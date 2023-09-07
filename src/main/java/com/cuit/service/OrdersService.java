package com.cuit.service;

import com.cuit.pojo.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> getAll();
    Orders getById(Integer id);

}
