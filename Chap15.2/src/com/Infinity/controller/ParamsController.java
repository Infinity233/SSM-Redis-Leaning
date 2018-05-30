package com.Infinity.controller;

import com.Infinity.pojo.Role;
import com.Infinity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.List;

@Controller
@RequestMapping("/params")
public class ParamsController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/showRoleJsonInfo")
    public ModelAndView showRoleJsonInfo(Long id, String roleName, String note) {

        ModelAndView mv = new ModelAndView();

        mv.setView(new MappingJackson2JsonView());
        mv.addObject("id", id);
        mv.addObject("note", note);
        mv.addObject("roleName", roleName);
        return mv;
    }

    @RequestMapping("/showRoleJsonInfo2")
    public ModelAndView showRoleJsonInfo(Role role) {

        ModelAndView mv = new ModelAndView();

        mv.setView(new MappingJackson2JsonView());
        mv.addObject("role", role);
        return mv;
    }

    @RequestMapping("/addRole")
    public String addRole(Model model, String roleName, String note) {
        Role role = new Role();

        role.setRoleName(roleName);
        role.setNote(note);

        //回填编号
        roleService.addRole(role);

        model.addAttribute("roleName", roleName);
        model.addAttribute("note", note);
        model.addAttribute("id",role.getId());

        return "redirect:./showRoleJsonInfo.do";
    }

    @RequestMapping("/addRole2")
    public ModelAndView addRole2(ModelAndView mv, String roleName, String note) {

        Role role = new Role();
        role.setRoleName(roleName);
        role.setNote(note);
        roleService.addRole(role);

        mv.addObject("roleName", roleName);
        mv.addObject("note", note);
        mv.addObject("id", role.getId());
        mv.setViewName("redirect:./showRoleJsonInfo.do");

        return mv;
    }

    @RequestMapping("/addRole3")
    public String addRole3(RedirectAttributes ra, Role role) {
        roleService.addRole(role);

        ra.addFlashAttribute("role", role);
        return "redirect:./showRoleJsonInfo2.do";
    }
}
