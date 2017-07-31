package com.scau.mimi.utils;

import com.scau.mimi.gson.User;

/**
 * Created by admin on 2017/5/13.
 */

public class DbUtil {

    public static void saveUser(User user) {
        user.save();
    }
}
