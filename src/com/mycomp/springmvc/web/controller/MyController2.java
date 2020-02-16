package com.mycomp.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController2 {

    /*
     * rest风格、restfulAPI与@PathVariable接收rest参数:
     *
     * rest风格: 资源定位及资源操作的风格, 不是协议,可以遵循,也可以不遵循;
     *
     * REST风格请求:
     * REST, 即Representational State Transfer, (资源)表现层状态转化;
     * 用URL定位资源,用HTTP描述操作;
     * 是目前最流行的一种互联网软件架构;
     * 它结构清晰、符合标准、易于理解、扩展方便，所以正得到越来越多网站的采用;
     * 使用POST, GET, PUT, DELETE 分别对应 CRUD;
     * Spring3.0 开始支持 REST 风格的请求;
     *
     * 传统的操作资源:
     * http://localhost:8080/get.action?id=10  	  查询 get
     * http://localhost:8080/add.action           新增 post
     * http://localhost:8080/update.action        修改 post
     * http://localhost:8080/delete.action?id=10  删除 post
     *
     * restful操作资源:
     * http://localhost:8080/goods/1     查询 GET
     * http://localhost:8080/goods       新增 POST
     * http://localhost:8080/goods       更新 PUT
     * http://localhost:8080/goods/1     删除 DELETE
     *
     * 使用@PathVariable接收RestFul风格参数;
     */

    /*
     * 用URL定位资源
     */
    @RequestMapping("/restful/{id}")
    public String testRestful(@PathVariable Integer id) {
        System.out.println("rest, id = " + id);
        return "/result.jsp";
    }

    /*
     * 发送put与delete请求:
     * 默认情况下Form表单是不支持PUT请求和DELETE请求的;
     * Spring3.0添加了一个过滤器HiddenHttpMethodFilter, 可以将post请求转换为PUT或DELETE请求;
     * 需要去web.xml中配置过滤器;
     * 配置完过滤器后, 在需要发送的表单内加一个隐藏的字段:
     * <input type="hidden" name="_method" value="put">
     * 详见web.xml和rest.jsp
     *
     * 但是, 在控制器内, 如果直接转发到jsp页面, 会报错;
     * 因为请求转发, 实质上是一次请求, 而jsp页面不支持PUT或DELETE请求;
     * 所以, 这里不能转发到jsp, 需要重定向到jsp页面;
     *
     * 这里测试发送PUT请求;
     */
    @RequestMapping(
            value = "/restfulFormPut/{id}",
            method = RequestMethod.PUT
    )
    public String testRestfulFormPut(@PathVariable Integer id) {
        System.out.println("rest, PUT, id = " + id);
        return "redirect: /localRedirect";
    }

    /*
     * 这里测试发送DELETE请求
     */
    @RequestMapping(
            value = "/restfulFormDelete/{id}",
            method = RequestMethod.DELETE
    )
    public String testRestfulFormDelete(@PathVariable Integer id) {
        System.out.println("rest, DELETE, id = " + id);
        return "redirect: /localRedirect";
    }

    @RequestMapping("localRedirect")
    public String localRedirect() {
        return "/result.jsp";
    }

}
