package com.revert.freemarkers.service.user;

import com.revert.common.base.constant.CommonConstant;
import com.revert.freemarkers.model.user.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserService {

    private String defaultAccount = "admin";
    private String defaultPassword = "admin";

    public boolean userLogin(UserModel userModel){
        String account = userModel.getAccount();
        String password = userModel.getPassword();
        if(!StringUtils.isEmpty(account) && !StringUtils.isEmpty(password) ){
            /**查询数据库 ····*/
            if(CommonConstant.DEFAULT_ACCOUNT.equals(account) && CommonConstant.DEFAULT_PASSWORD.equals(password)){
                return true;
            }
        }
        return false;
    }

}
