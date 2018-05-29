package com.Infinity.controller;

import com.Infinity.pojo.Role;
import com.Infinity.pojo.RoleParams;
import com.Infinity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
@RequestMapping("/params")
public class ParamsController {

    @Autowired
    RoleService roleService;

    // 如果传递过来的参数名称和HTTP的保存一致， 那么无需任何注解也能获取参数
    // 允许为空
    @RequestMapping("/commonParams")
    public ModelAndView commonParams(String roleName, String note) {
        System.out.println("roleName =>" + roleName);
        System.out.println("note =>" + note);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        return mv;
    }

    /*
     *   用于管理多个参数
     *   pojo的属性也要和HTTP请求参数名称保持一致
     *   即使没有任何注解，也能有效传递参数
     */
    @RequestMapping("/commonParamPojo.do")
    public ModelAndView commonParamPojo(RoleParams roleParams) {
        System.out.println("roleName =>" + roleParams.getRoleName());
        System.out.println("note =>" + roleParams.getNote());
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        return mv;
    }

    /*
    *    使用@RequestParam注解
    *    解决与前端参数名不一致的问题
    *    默认不能为空
    */
    @RequestMapping("/requestParam")
    public ModelAndView requestParam(@RequestParam(value = "role_name", required = false) String roleName, String note) {

        System.out.println("roleName =>" + roleName);
        System.out.println("note =>" + note);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        return mv;
    }

    @RequestMapping("/getRole/{id}")
    public ModelAndView pathVariable(@PathVariable("id") Long id) {
        Role role = roleService.getRole(id);
        System.out.println(role);
        ModelAndView mv = new ModelAndView();
        mv.addObject(role);

        mv.setView(new MappingJackson2JsonView());
        return mv;
    }
}
