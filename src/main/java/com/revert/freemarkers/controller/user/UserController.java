package com.revert.freemarkers.controller.user;

import com.revert.common.base.result.ResultData;
import com.revert.freemarkers.model.user.UserModel;
import com.revert.freemarkers.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ResultData<String> loginVer(UserModel userModel){
        ResultData<String> resultData = new ResultData<String>();
        if(userService.userLogin(userModel)){
            return resultData;
        }else{
            resultData.code("500");
            return resultData;
        }
    }

    @RequestMapping("all")
    public ResultData<List<UserModel>> getAll(){
        return new ResultData<List<UserModel>>().data(userService.selectAll());
    }


}
