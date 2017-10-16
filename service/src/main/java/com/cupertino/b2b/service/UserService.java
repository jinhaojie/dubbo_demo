package com.cupertino.b2b.service;


import com.cupertino.b2b.domain.User;

public interface UserService {

    int insert(User record);

    int insertSelective(User record);
}