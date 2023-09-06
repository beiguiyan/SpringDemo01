package com.ruantong.yun.dao.impl;

import com.ruantong.yun.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
@Repository
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Value("${url}")
    private String value;
    @Override
    public void save() {
        System.out.println("book dao ......." + value);
    }

    @PostConstruct
    public void iniBean() {
        System.out.println("====init bean=====");
    }

    @PreDestroy
    public void destBean() {
        System.out.println("====dest bean=====");
    }
}
