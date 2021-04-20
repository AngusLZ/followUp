package com.hack.followup.controller;

import com.hack.followup.dao.TestDao;
import com.hack.followup.pojo.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 会飞的野鸡
 * @version 1.0.0
 * @class Test
 * @date 19:14
 * @description TODO
 */

@Controller
public class Test {

    @Autowired
    private TestDao testDao;

    @GetMapping("/a")
    public void a(){
        List<Member> members = testDao.queryAll();
        System.out.println(members.get(0).getTel());
    }
}
