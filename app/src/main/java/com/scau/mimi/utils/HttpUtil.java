package com.scau.mimi.utils;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by admin on 2017/5/12.
 */

public class HttpUtil {

    public static void getResponseFromURL(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }

    public static void postDataToURL(String address, RequestBody body, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .post(body)
                .build();
        client.newCall(request).enqueue(callback);
    }

    public static RequestBody getRequestBody(String[] keys, String[] values) {
        FormBody.Builder builder = new FormBody.Builder();

        for (int i = 0; i < keys.length; i++) {
            builder.add(keys[i], values[i]);
        }

        return builder.build();
    }
}
