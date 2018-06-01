/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.service.modules.onmyoji;

import com.onmyoji.entity.modules.onmyoji.Onmyoji;

/**
 * @author jiangchao
 * Created on 2018/3/30.
 */
public interface OnmyojiService {

  /**
   * 根据用户名密码查询用户.
   *
   * @param onmyoji
   * @return
   */
  public Onmyoji queryOnmyojiByNameAndPassword(Onmyoji onmyoji);

}
