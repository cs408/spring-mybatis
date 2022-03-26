package com.example.springmybatis.mapper;

import com.example.springmybatis.entity.TMsg;
import org.apache.ibatis.annotations.Mapper;

/**
 * <b>Description</b>:<br>
 *
 * <b>Author</b>:lixuwu<br>
 * <b>Date</b>:2022/03/26 下午 6:48<br>
 */
@Mapper
public interface TMsgMapper {
    public TMsg findById(Integer id);

}
