package com.revert.utils;

public class SkipUtil {

    /**
     * 跳转路径
     * @param suffix
     * @param paths
     * @return
     */
    public static String getPath(String suffix,String ...paths){
        StringBuffer sb = new StringBuffer();
        for(String p : paths){
            sb.append(p);
        }
        if(sb.length() == 0){
            return null;
        }
        sb.append(suffix);
        return sb.toString();
    }


}
