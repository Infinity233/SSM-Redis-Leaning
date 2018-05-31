package com.Infinity.service;

import com.Infinity.dao.StudentDao;
import com.Infinity.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private StudentDao dao;

    @Override
    public Role getRole(Long id) {
        return dao.getRole(id);
    }

//    @Override
//    public List<Role> findRoles(RoleParams roleParams) {
//        return dao.findRoles(roleParams.getPageParams().getStart(), roleParams.getPageParams().getLimit());
//    }

    @Override
    public int deleteRoles(List<Long> idList) {
        return dao.deleteRoles(idList);
    }

    @Override
    public int addRoles(List<Role> roleList) {
        int sum = 0;
        for (Role role : roleList) {
            sum += dao.insertRole(role);
        }
        return sum;
    }

    @Override
    public int addRole(Role role) {
        return dao.insertRole(role);
    }
}
