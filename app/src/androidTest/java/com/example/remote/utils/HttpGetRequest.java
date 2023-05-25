package com.example.remote.utils;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Get请求
 */
public class HttpGetRequest {
    public static void sendOkHttpGetRequest(String address,okhttp3.Callback callback){
        //设置超时时间
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(50,TimeUnit.SECONDS);
        OkHttpClient client = builder.build();

//        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .get()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}