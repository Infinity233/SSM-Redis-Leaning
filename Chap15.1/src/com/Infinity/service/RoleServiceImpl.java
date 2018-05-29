package com.Infinity.service;

import com.Infinity.dao.StudentDao;
import com.Infinity.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

    @Autowired
    private StudentDao dao;

    @Override
    public Role getRole(Long id) {
        return dao.getRole(id);
    }
}
