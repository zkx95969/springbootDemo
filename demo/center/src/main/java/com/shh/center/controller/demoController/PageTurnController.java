package com.shh.center.controller.demoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
@Controller
public class PageTurnController {

    @RequestMapping("/{page}")
    public String demo(@PathVariable("page")String page, Model model){
        model.addAttribute("name","张三");
        return "/demo/"+page;
    }
}