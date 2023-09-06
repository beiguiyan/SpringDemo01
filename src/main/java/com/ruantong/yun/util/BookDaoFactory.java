package com.ruantong.yun.util;

import com.ruantong.yun.dao.BookDao;
import com.ruantong.yun.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 *
 * <重点实现方式>
 **/
public class BookDaoFactory implements FactoryBean<BookDao> {
    @Override
    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }
}
