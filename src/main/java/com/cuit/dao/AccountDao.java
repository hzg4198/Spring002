package com.cuit.dao;

public interface AccountDao {
    void IncreaseMoney(Integer id,Double money);
    void DecreaseMoney(Integer id,Double money);
}
