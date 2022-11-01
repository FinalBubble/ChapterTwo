package com.tedu.controller;

import com.tedu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {

    //url:http://localhost:8080/day11-SpringMVC/testModel?name=老安&gender=gender&addr=北京&age=19&score=59&salary=1000
    @RequestMapping("/testModel")
    public String testModel(User user, Model model){
        model.addAttribute("u1",user);
        return "home";
    }
}
