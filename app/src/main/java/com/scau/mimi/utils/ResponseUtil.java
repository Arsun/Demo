package com.scau.mimi.utils;

import com.google.gson.Gson;
import com.scau.mimi.gson.LoginInfo;

import java.io.IOException;

import okhttp3.Response;

/**
 * Created by admin on 2017/5/12.
 */

public class ResponseUtil {

    /*
    获取请求体
     */
    public static String getString(Response response) {
        try {
            String data = response.body().string();
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /*
    返回登录结果
    成功时保存登录信息
     */
    public static boolean handleLoginInfo(String jsonData) {
        LoginInfo info = new Gson().fromJson(jsonData, LoginInfo.class);
        if (info.user != null) {
            DbUtil.saveUser(info.user);
            return true;
        }
        return false;
    }
}
