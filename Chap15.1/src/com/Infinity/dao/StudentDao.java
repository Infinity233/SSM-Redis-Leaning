package com.Infinity.dao;

import com.Infinity.pojo.Role;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface StudentDao {

    Role getRole(long id);
}
