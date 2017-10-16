package com.cupertino.b2b.service.impl;

import com.cupertino.b2b.domain.User;
import com.cupertino.b2b.service.UserService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jin Haojie
 * @date 17-3-2
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int insert(User record) {
        sqlSessionTemplate.insert("insertUser", record);
        return 1;
    }

    @Override
    public int insertSelective(User record) {
        return 1;
    }


}
