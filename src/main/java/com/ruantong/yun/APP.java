package com.ruantong.yun;

import com.ruantong.yun.service.BookService;
import com.ruantong.yun.service.impl.BookServiceImpl;
import com.ruantong.yun.util.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
public class APP {

    public static void main(String[] args) {
        // ClassPathXmlApplicationContext cxf = new ClassPathXmlApplicationContext("applicationContext1.xml");
        // BookService bookService = (BookService) cxf.getBean("bookService");
        // bookService.save();

        // BookService dao = (BookService) cxf.getBean("bookService");
        // dao.save();

        //cxf.close();
       // cxf.registerShutdownHook(); // 钩子方法


        // ApplicationContext cxf = new ClassPathXmlApplicationContext("applicationContext1.xml");
        // DataSource source = (DataSource) cxf.getBean("dataSource");
        //
        // BookDao bookDao = (BookDao) cxf.getBean("bookDaoImpl");
        // bookDao.save();
        //
        // System.out.println("-----------------------");
        // BookDao bean = cxf.getBean(BookDao.class);
        // bean.save();

        AnnotationConfigApplicationContext cxf = new AnnotationConfigApplicationContext(SpringConfig.class);
        // BookDao bookDao1 = (BookDao) cxf.getBean("bookDaoImpl");
        // BookDao bookDao2 = (BookDao) cxf.getBean("bookDaoImpl");
        // System.out.println(bookDao1);
        // System.out.println(bookDao2);
        //
        // cxf.close();

        // BookService bean = cxf.getBean(BookServiceImpl.class);
        // bean.save();

        // DataSource data = cxf.getBean(DataSource.class);
        BookService bookService = (BookService) cxf.getBean("bookServiceImpl");
        //bookService.save();

        System.out.println(bookService.checkCode("https://baiduyun/cccc", "root "));

    }
}
