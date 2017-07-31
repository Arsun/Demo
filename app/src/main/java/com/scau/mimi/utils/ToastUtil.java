package com.scau.mimi.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by admin on 2017/5/12.
 */

public class ToastUtil {

    public static void toast(Context context, String content) {
        Toast.makeText(
                context,
                content,
                Toast.LENGTH_SHORT)
                .show();
    }
}
