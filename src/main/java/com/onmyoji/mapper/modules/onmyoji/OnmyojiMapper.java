/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.mapper.modules.onmyoji;

import com.onmyoji.entity.modules.onmyoji.Onmyoji;

/**
 * @author jiangchao
 * Created on 2018/3/25.
 */
public interface OnmyojiMapper {

  /**
   * 根据用户名密码查询用户.
   *
   * @param onmyoji
   * @return
   */
  public Onmyoji selectOnmyojiByNameAndPassword(Onmyoji onmyoji);

}
