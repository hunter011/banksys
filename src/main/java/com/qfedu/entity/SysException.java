package com.qfedu.entity;

/**
 * Created by   Intellif Idea 2019.08
 * Author:  Wang Yun
 * Date:    2019-08-10
 * Time:    20:25
 */
public class SysException extends Exception {

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
