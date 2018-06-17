package com.revert.freemarkers.controller.pathSkip;

import com.revert.utils.SkipUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping("/weixin")
public class PathSkipController {
    /** 默认登陆页面*/
    private String defaultLoginPath = "login";
    /** 默认页面前缀（除登陆页面）*/
    private String defaultPrefixPath = "/pages";

    private String defaultFileSuffix = ".html";

    @RequestMapping(method = {RequestMethod.GET})
    public String login(){
        return SkipUtil.getPath(defaultFileSuffix,defaultLoginPath);
    }


    @RequestMapping("/skip/${path}")
    public String skipPage(@PathVariable String path){
        return path;
    }


}
