package com.ruantong.yun.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean getSqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setTypeAliasesPackage("com.ruantong.yun.pojo");
        sqlSessionFactoryBean.setDataSource(dataSource);

        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapper = new MapperScannerConfigurer();
        mapper.setBasePackage("com.ruantong.yun.dao");

        return mapper;
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource source) {
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(source);

        return tm;
    }
}
