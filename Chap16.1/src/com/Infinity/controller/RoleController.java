package com.Infinity.controller;

import com.Infinity.pojo.Role;
import com.Infinity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService = null;

    @RequestMapping("/getRole")
    @ResponseBody
    public Role roleTest(Long id) {

        Role role = roleService.getRole(id);

        return role;
    }

}
