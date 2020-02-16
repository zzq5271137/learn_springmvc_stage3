package com.mycomp.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController3 {

    /*
     * @RequestHeader: 在方法中接收请求头当中的信息
     */
    @RequestMapping("reqHeader")
    public String testReqHeader(@RequestHeader("Host") String host,
                                @RequestHeader("Referer") String referer,
                                @RequestHeader("Cookie") String cookie) {
        System.out.println("Host: " + host);
        System.out.println("Referer: " + referer);
        System.out.println("Cookie: " + cookie);
        return "/result.jsp";
    }

    /*
     * @CookieValue: 用来接收浏览发送过来的cookes值
     */
    @RequestMapping("cookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println("JSESSIONID: " + sessionId);
        return "/result.jsp";
    }
}
