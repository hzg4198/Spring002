package com.cuit.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.cuit")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
