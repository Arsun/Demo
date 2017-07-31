package com.scau.mimi.gson;

import android.support.annotation.Nullable;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2017/5/13.
 */

public class User extends DataSupport{

    public int id;

    public String userId;

    public String userName;

    public String nickName;

    @Nullable
    public String trueName;

    public String lastLoginTime;

    public String isCheck;

    public String accessToken;

}