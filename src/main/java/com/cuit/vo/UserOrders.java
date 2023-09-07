package com.cuit.vo;

import com.cuit.pojo.Orders;
import com.cuit.pojo.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserOrders extends User {
    private List<Orders> orders;

    @Override
    public String toString() {
        return "UserOrders{" +super.toString()+
                "orders=" + orders +
                '}';
    }
}
