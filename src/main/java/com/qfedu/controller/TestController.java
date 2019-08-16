package com.qfedu.controller;

import com.qfedu.entity.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by   Intellif Idea 2019.08
 * Author:  Wang Yun
 * Date:    2019-08-10
 * Time:    19:52
 */
@Controller
public class TestController {

    @RequestMapping("/test01.do")
    public String method() throws SysException {

        try {
           int sum = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("不能除以0");
        }
        return "/index.html";
    }
}
