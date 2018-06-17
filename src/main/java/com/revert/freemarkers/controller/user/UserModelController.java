package com.revert.freemarkers.controller.user;

import com.revert.common.base.constant.CommonConstant;
import com.revert.freemarkers.model.user.UserModel;
import com.revert.freemarkers.service.user.UserService;
import com.revert.utils.SkipUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/model/v1/user")
public class UserModelController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all")
    public ModelAndView index(ModelAndView modelAndView) {
        String path = SkipUtil.getDefaultPagesPath("userList");
        /**返回 templates 页面*/
        modelAndView.setViewName(path);
        List<UserModel> userList = null;
        userList = userService.selectAll2();
        /**带入值*/
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }

}
