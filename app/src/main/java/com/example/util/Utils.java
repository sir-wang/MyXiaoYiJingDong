package com.example.util;

import java.util.Map;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/4/10 0010.
 */

public class Utils {
    private Utils (){};
    static OkHttpClient okHttpClient;
    public static OkHttpClient getClient(){
        if(okHttpClient==null){
            synchronized (Utils.class){
                okHttpClient= new OkHttpClient();
            }
        }
        return okHttpClient;
    }
    public static void doget(String url, Callback callback){
        OkHttpClient client = getClient();
        Request request=new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(callback);
    }
    public static void dopost(String url, Map<String,String> parse, Callback callback){
        OkHttpClient client = getClient();
        FormBody.Builder body=new FormBody.Builder();
        for(String key:parse.keySet()){
            body.add(key,parse.get(key));
        }
        Request request=new Request.Builder()
                .url(url)
                .post(body.build())
                .build();
        client.newCall(request).enqueue(callback);
    }
}
