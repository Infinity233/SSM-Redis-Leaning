package com.Infinity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/role")
public class RoleController {

    @RequestMapping("/roleTest")
    public ModelAndView roleTest() {

        return null;
    }

}
