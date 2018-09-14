package com.shh.center.controller.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description : 读取配置文件 @PropertySource("classpath:config/config.yml")为配置文件地址,@Value("${name}")为读取的属性
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
@Controller
@PropertySource("classpath:config/config.yml")
public class PageTurnController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${sex}")
    private String sex;


    @RequestMapping("/{page}")
    public String demo(@PathVariable("page")String page, Model model){
        model.addAttribute("age",age);
        model.addAttribute("name",name);
        System.out.println(name+age);
        model.addAttribute("sex",sex);
        return "/demo/"+page;
    }
    @RequestMapping("/error/{page}")
    public String error(@PathVariable("page")String page){
        return "/error/"+page;
    }
}