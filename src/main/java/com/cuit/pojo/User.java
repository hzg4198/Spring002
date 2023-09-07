package com.cuit.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
   private Integer id;
   private String  username;
   private String  birthday;
   private String  sex;
   private String  address;
}
