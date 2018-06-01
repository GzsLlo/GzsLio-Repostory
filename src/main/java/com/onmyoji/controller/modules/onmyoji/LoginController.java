/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.controller.modules.onmyoji;

import com.onmyoji.service.modules.onmyoji.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangchao
 * Created on 2018/3/25.
 */
@Controller
@RequestMapping("views")
public class LoginController {

  @Autowired
  private UserService userService;

  /**
   * 登陆页面.
   *
   * @return mv
   */
  @RequestMapping("/modules/user/login.html")
  public ModelAndView doLogin() {
    ModelAndView mv = new ModelAndView();
    mv.addObject("iccid", "20180205016728152098");
    mv.setViewName("test/simDiagnostic");

    String acctName = userService.selectUserByUsernameAndPassword("admin");
    System.out.println("*******************");
    System.out.println(acctName);
    return mv;
  }

}
