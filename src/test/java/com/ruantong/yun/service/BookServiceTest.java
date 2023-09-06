package com.ruantong.yun.service;

import com.ruantong.yun.dao.BookDao;
import com.ruantong.yun.util.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testSave() {
        bookDao.save();
        System.out.println("----");
    }
}
