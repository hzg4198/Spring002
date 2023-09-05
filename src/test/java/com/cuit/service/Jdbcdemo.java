package com.cuit.service;

import java.sql.*;

public class Jdbcdemo {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis","root","123456");
            String sql = "select * from user where username=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"王五");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("id")+" "+resultSet.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
