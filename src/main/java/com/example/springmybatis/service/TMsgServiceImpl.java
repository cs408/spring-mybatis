package com.example.springmybatis.service;

import com.example.springmybatis.entity.TMsg;
import com.example.springmybatis.mapper.TMsgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b>Description</b>:<br>
 *
 * <b>Author</b>:lixuwu<br>
 * <b>Date</b>:2022/03/26 下午 6:53<br>
 */
@Service
public class TMsgServiceImpl  implements TMsgService {

    @Autowired
    private TMsgMapper tMsgMapper;

    @Override
    public TMsg findById(Integer id) {
        return tMsgMapper.findById(id);
    }
}
