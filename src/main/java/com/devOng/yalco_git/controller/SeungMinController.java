package com.devOng.yalco_git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeungMinController {

    @GetMapping("/seungmin")
    public String seungmin(){

        return "seungmin";
    }



}
