package com.shh.center.controller.demoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: wujun
 * @CreateDate: 2018/9/14 8:52
 * @Version: 1.0
 */
@Controller
public class PageTurnController {

    @RequestMapping("/{page}")
    public String demo(@PathVariable("page")String page, Model model){
        model.addAttribute("name","张三");
        return "/demo/"+page;
    }
}