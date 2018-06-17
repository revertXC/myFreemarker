package com.revert.common.base.result;

import java.io.Serializable;

/**
 * 返回数据
 */
public class ResultData<T> implements Serializable {

    private String code = "200";
    private String message = "succeed";
    private T data;

    public ResultData code(String code){
        this.code = code;
        return this;
    }

    public ResultData message(String message){
        this.message = message;
        return this;
    }

    public ResultData data(T data){
        this.data = data;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
