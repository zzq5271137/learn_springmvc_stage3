package com.mycomp.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    /*
     * value属性:
     * 用来设置请求路径;
     * 值是一个字符串数组;
     * 可以设置多个路径共同访问对应方法;
     */
    @RequestMapping(value = {"value1", "value2"})
    public String testValue() {
        return "/result.jsp";
    }

    /*
     * method属性:
     * 用来设置映射的请求方式;
     * 值是RequestMethod里面常量的数组;
     * 如果没有写,则没有限制,post与get都可以请求到对应的方法;
     * 如果指定了请求类型,则必须得是相应的请求才能访问到对应的方法;
     */
    @RequestMapping(
            value = "method",
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    public String testMethod() {
        return "/result.jsp";
    }

    /*
     * params属性:
     * 必须设置对应的请求参数和请求值才能访问到对应的内容;
     */
    @RequestMapping(
            value = "params",
            params = {"id!=1", "name=zzq"}
    )
    public String testParams() {
        return "/result.jsp";
    }

    /*
     * headers属性:
     * 发送的请求头必须要与设置的请求相同时,才能够访问到对应的方法;
     */
    @RequestMapping(
            value = "headers",
            headers = {"Host=localhost:8080", "Referer=http://localhost:8080/requestMapping.jsp"}
    )
    public String testHeaders() {
        return "/result.jsp";
    }

    /*
     * ant风格地址:
     * ant风格是请求路径的一种匹配方法;
     * 它使用通配符进行匹配:
     * 1. ? : 一个?匹配一个字符, 有几个?就匹配几个字符;
     * 2. * : 匹配任意字符;
     * 3. **: 匹配多重路径;
     */
    @RequestMapping(
            value = {"myAnt/?", "myAnt/*", "myAnt/**"}
    )
    public String testAnt() {
        return "/result.jsp";
    }
}
