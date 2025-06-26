package com.codewithdave.store.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String sayHello(Model model){
        model.addAttribute("name", "Dave");

        return "index";
    }
}
