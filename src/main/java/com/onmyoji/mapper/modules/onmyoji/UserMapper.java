package com.onmyoji.mapper.modules.onmyoji;


import com.onmyoji.entity.modules.onmyoji.User;

public interface UserMapper {

  public String selectUserByUsernameAndPassword(String acctName);

  public void saveUser(User user);

}
