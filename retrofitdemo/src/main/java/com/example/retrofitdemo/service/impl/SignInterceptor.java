package com.example.retrofitdemo.service.impl;

import com.github.lianjiatech.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SignInterceptor extends BasePathMatchInterceptor {
    private String accessKeyId;
    private String accessKeySecret;

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }


    @Override
    protected Response doIntercept(Chain chain) throws IOException {
        //追加到请求的header里
//        Request request = chain.request();
//        Request newReq = request.newBuilder()
//                .addHeader("accessKeyId", accessKeyId)
//                .addHeader("accessKeySecret", accessKeySecret)
//                .build();
//        return chain.proceed(newReq);

        //追加到请求url链接里
        Request request = chain.request();
        HttpUrl url = request.url();
        long timestamp = System.currentTimeMillis();
        HttpUrl newUrl = url.newBuilder()
                .addQueryParameter("accessKeyId", this.accessKeyId)
                .addQueryParameter("accessKeySecret", this.accessKeySecret)
                .build();
        Request newRequest = request.newBuilder()
                .url(newUrl)
                .build();
        return chain.proceed(newRequest);
    }
}
