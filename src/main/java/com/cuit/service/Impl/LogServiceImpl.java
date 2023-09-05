package com.cuit.service.Impl;

import com.cuit.mapper.LogMapper;
import com.cuit.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void log(String out, String in, Double money) {
        logMapper.log(out+"转给"+in+":"+money+"元");
    }

}
