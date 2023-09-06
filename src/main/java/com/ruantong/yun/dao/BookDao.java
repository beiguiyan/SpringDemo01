package com.ruantong.yun.dao;

import org.springframework.transaction.annotation.Transactional;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/
public interface BookDao {

    @Transactional
    void save();
}
