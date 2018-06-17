package com.revert.freemarkers.service.user;

import com.revert.common.base.constant.CommonConstant;
import com.revert.freemarkers.model.user.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {

    /**
     * 用户登录
     * @param userModel
     * @return
     */
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


    public List<UserModel> selectAll(){
        List<UserModel> listUser = new LinkedList<>();
        UserModel user = null;
        for(int i=0 ; i<10 ; i++){
            user = new UserModel();
            user.setId((long) i);
            user.setName("张三 "+i);
            user.setGender( i%2 == 0 ? "男" : "女");
            listUser.add(user);
        }
        return listUser;
    }

    public List<UserModel> selectAll2(){
        List<UserModel> listUser = new LinkedList<>();
        UserModel user = null;
        for(int i=0 ; i<10 ; i++){
            user = new UserModel();
            user.setId((long) i);
            if(i != 2){
                user.setName("张三 "+i);
                user.setGender( i%2 == 0 ? "男" : "女");
            }
            listUser.add(user);
        }
        return listUser;
    }



}
