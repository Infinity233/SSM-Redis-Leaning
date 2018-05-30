package com.Infinity.controller;

import com.Infinity.pojo.Role;
import com.Infinity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.List;

@Controller
@RequestMapping("/attribute")
@SessionAttributes(names = {"id"}, types = {Role.class})
public class ParamsController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/requestAttribute")
    public ModelAndView reqAttr(@RequestAttribute("id") Long id) {
        ModelAndView mv = new ModelAndView();

        Role role = roleService.getRole(id);
        mv.addObject("role", role);
        mv.setView(new MappingJackson2JsonView());
        return mv;
    }

    @RequestMapping("/sessionAttributes")
    public ModelAndView sessionAttrs(Long id) {

        ModelAndView mv = new ModelAndView();
        Role role = roleService.getRole(id);
        System.out.println(role);
        mv.addObject("role", role);
        mv.addObject("id", id);

        mv.setViewName("sessionAttribute");
        return mv;
    }

    @RequestMapping("/sessionAttribute")
    public ModelAndView sessionAttr(@SessionAttribute("id") Long id) {
        ModelAndView mv = new ModelAndView();

        Role role = roleService.getRole(id);
        mv.addObject("role",role);
        mv.setView(new MappingJackson2JsonView());

        return mv;
    }

    @RequestMapping("/getHeaderAndCookie")
    public String testHeaderAndCookie (
            @RequestHeader(value = "User-Agent", required = false, defaultValue = "attribute")
            String userAgent,
            @CookieValue(value="JSESSIONID", required = false, defaultValue = "MyJsessionId")
            String jsessionId){

        System.out.println("User-Agent: " + userAgent);
        System.out.println("JSESSIONID: " + jsessionId);

        return "index";
    }
}
