package com.viperious.controller;

import com.viperious.service.QuickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/quick")
public class QuickController {

    //直接注入Service进行使用
    @Autowired
    private QuickService quickService;

//    @RequestMapping(value = {"/show","/showxxx","/showyyy"},method = RequestMethod.GET)
    @GetMapping(value = "/show")
    public String show() {
        System.out.println("show running...."+quickService);
        return "/index.jsp";
    }

    @RequestMapping(value = {"/show2"})
    public String show2() {
        System.out.println("show2 running...."+quickService);
        return "/index.jsp";
    }

}
