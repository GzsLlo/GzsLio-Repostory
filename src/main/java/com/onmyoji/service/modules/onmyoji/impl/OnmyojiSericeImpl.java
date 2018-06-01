/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.service.modules.onmyoji.impl;

import com.onmyoji.entity.modules.onmyoji.Onmyoji;
import com.onmyoji.mapper.modules.onmyoji.OnmyojiMapper;
import com.onmyoji.service.modules.onmyoji.OnmyojiService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jiangchao
 * Created on 2018/3/25.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class OnmyojiSericeImpl implements OnmyojiService {


  private OnmyojiMapper onmyojiMapper;

  /**
   * 根据用户名密码查询用户.
   *
   * @param onmyoji
   * @return
   */
  @Override
  public Onmyoji queryOnmyojiByNameAndPassword(Onmyoji onmyoji) {
    return onmyojiMapper.selectOnmyojiByNameAndPassword(onmyoji);
  }

}
