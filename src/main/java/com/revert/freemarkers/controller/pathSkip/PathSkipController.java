package com.revert.freemarkers.controller.pathSkip;

import com.revert.common.base.constant.CommonConstant;
import com.revert.utils.SkipUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller()
@RequestMapping("/weixin")
public class PathSkipController {
    /** 默认登陆页面*/
    private String defaultLoginPath = "login";


    @RequestMapping(method = {RequestMethod.GET})
    public String login(){
        return SkipUtil.getPath(CommonConstant.defaultFileSuffix,defaultLoginPath);
    }

    /**
     *  直接跳转模板
     *  注：尽量少用这种方式直接跳转，除非有大批查询数据比较慢
     * @return
     */
    @RequestMapping("skip/**")
    public String skipPage(HttpServletRequest request){
        String indexStr = "skip";
        String path = request.getRequestURI();
        path = path.substring(path.indexOf(indexStr) + indexStr.length());
        return path;
    }


}
