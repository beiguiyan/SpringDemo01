package com.ruantong.yun.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
@Configuration
@ComponentScan("com.ruantong")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class}) // 推荐方式
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {

}
