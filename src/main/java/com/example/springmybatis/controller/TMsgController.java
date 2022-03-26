package com.example.springmybatis.controller;

import com.example.springmybatis.entity.TMsg;
import com.example.springmybatis.service.TMsgService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>Description</b>:<br>
 *
 * <b>Author</b>:lixuwu<br>
 * <b>Date</b>:2022/03/26 下午 6:53<br>
 */

@RestController
@RequestMapping("/msg")
public class TMsgController {

    @Autowired
    private TMsgService tMsgService;

    @GetMapping("/getMsg")
    public String getMsg(@Param("id") Integer id){
        TMsg tMsg = tMsgService.findById(id);
        return tMsg.getMessage();
    }

}