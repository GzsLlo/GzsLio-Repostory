package com.onmyoji.service.modules.onmyoji.impl;

import com.onmyoji.mapper.modules.onmyoji.UserMapper;
import com.onmyoji.service.modules.onmyoji.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

  @Autowired
  private UserMapper userMapper;

  @Override
  public String selectUserByUsernameAndPassword(String acctName) {
    return userMapper.selectUserByUsernameAndPassword(acctName);
  }
}
