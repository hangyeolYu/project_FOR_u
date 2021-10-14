package com.example.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi") //어노테이션
    public String niceToMeetYou (Model model) {
        model.addAttribute("username","hongpark");
        return "greetings"; //templates.mustache -> 브라우저로 전송!
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname","홍길동");
    return "goodbye";
    }
}
