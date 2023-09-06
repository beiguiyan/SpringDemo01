package com.ruantong.yun.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
public class JdbcConfig {
    /**
     * 管理第三方库中的Bean
     */
    @Bean
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("${driverClassName}");
        dataSource.setUrl("${url}");
        dataSource.setUsername("${username}");
        dataSource.setPassword("${password}");

        return dataSource;
    }
}
