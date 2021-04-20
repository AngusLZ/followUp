package com.hack.followup.dao;

import com.hack.followup.pojo.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 会飞的野鸡
 * @version 1.0.0
 * @class TestDao
 * @date 19:20
 * @description TODO
 */
@Mapper
public interface TestDao {
    @Select("select * from member")
    List<Member> queryAll();
}
