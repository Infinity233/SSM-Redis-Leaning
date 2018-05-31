package com.Infinity.dao;

import com.Infinity.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface StudentDao {

    Role getRole(long id);

    List<Role> findRoles(@Param("start") int start,@Param("limit") int limit);

    int deleteRoles(@Param("idList") List<Long> idList);

    int insertRole(@Param("role") Role role);
}
