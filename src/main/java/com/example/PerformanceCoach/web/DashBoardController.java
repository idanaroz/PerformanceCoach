package com.example.PerformanceCoach.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {

    //    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String rootView(){
        return "index";
    }

}
