package com.cuit.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createTime;
    private String note;
}
