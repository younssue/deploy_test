package org.deploy.deploytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResponseController {

    @RequestMapping("")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!!");

        return "index";
    }

}
