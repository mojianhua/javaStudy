package com.jim.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /**
     * @ResponseBody 打印内容到页面上去
     * @RequestMapping 路由连接
     * */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
}
