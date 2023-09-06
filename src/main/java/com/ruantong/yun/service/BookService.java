package com.ruantong.yun.service;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
public interface BookService {

    void save();

    void update();

    void delete();

    void findById(int id);

    boolean checkCode(String url, String password);
}
