package com.Infinity.main;

import com.Infinity.pojo.Role;
import com.Infinity.service.RoleService;
import com.Infinity.service.RoleServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {



    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        RoleService roleService = (RoleService)ac.getBean(RoleService.class);

        Role role = roleService.getRole(1L);

        System.out.println(role);

    }
}
