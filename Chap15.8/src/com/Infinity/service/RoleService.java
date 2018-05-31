package com.Infinity.service;

import com.Infinity.pojo.Role;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoleService {

    Role getRole(Long id);

//    List<Role> findRoles(RoleParams roleParams);

    int deleteRoles(List<Long> idList);

    int addRoles(List<Role> roleList);

    int addRole(Role role);
}
