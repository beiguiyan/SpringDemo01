package com.ruantong.yun.service.impl;

import com.ruantong.yun.dao.BookDao;
import com.ruantong.yun.dao.impl.BookDaoImpl;
import com.ruantong.yun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public void save() {
        long beigin = System.currentTimeMillis();

        for (int i=1; i<10000; i++) {
            System.out.println("==BookServiceImpl save===");
        }

        long end = System.currentTimeMillis();

        System.out.println("==BookServiceImpl save run " + (end - beigin) + " ms.===");
    }

    @Override
    public void update() {
        System.out.println(System.currentTimeMillis());
        System.out.println("==BookServiceImpl update===");
    }

    @Override
    public void delete() {
        System.out.println("==BookServiceImpl delete===");
    }

    @Override
    public void findById(int id) {
        System.out.println("==BookServiceImpl findById===");
    }

    @Override
    public boolean checkCode(String url, String password) {
        System.out.println(password.getBytes().length);
        return "root".equals(password);
    }

}
