package com.sdd.sbb1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/hello")
    @ResponseBody
    public String ShowHello() {
        return "안녕하세요";
    }
}
