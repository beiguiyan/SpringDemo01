package com.ruantong.yun.util;

import com.ruantong.yun.dao.BookDao;
import com.ruantong.yun.dao.impl.BookDaoImpl;
import com.ruantong.yun.service.BookService;
import com.ruantong.yun.service.impl.BookServiceImpl;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
public class Factory {

    public static BookDao getInstall() {
        return new BookDaoImpl();
    }
}
