package com.example.springmybatis.service;

import com.example.springmybatis.entity.TMsg;

/**
 * <b>Description</b>:<br>
 *
 * <b>Author</b>:lixuwu<br>
 * <b>Date</b>:2022/03/26 下午 6:52<br>
 */

public interface TMsgService {
    public TMsg findById(Integer id);
}
