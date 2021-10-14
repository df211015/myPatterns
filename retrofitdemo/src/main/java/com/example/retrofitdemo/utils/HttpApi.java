package com.example.retrofitdemo.utils;

import com.example.retrofitdemo.domain.Result;
import com.example.retrofitdemo.domain.VehicleInfo;
import com.example.retrofitdemo.service.impl.Sign;
import com.example.retrofitdemo.service.impl.SignInterceptor;
import com.example.retrofitdemo.service.impl.TimeStampInterceptor;
import com.github.lianjiatech.retrofit.spring.boot.annotation.Intercept;
import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import retrofit2.http.GET;
import retrofit2.http.Query;

@RetrofitClient(baseUrl = "${test.baseUrl}", poolName = "test1")
//@Intercept(handler = TimeStampInterceptor.class, include = {"/carsv/**"}, exclude = "/carsv/car/submit")
@Sign(accessKeyId = "${test.accessKeyId}", accessKeySecret = "${test.accessKeySecret}", include = {"/carsv/**"}, exclude = "/carsv/car/submit")
public interface HttpApi {
    @GET("carsv/car/getCar?authCode=a")
    Result<VehicleInfo> getVehicleInfo(@Query("unId") String unId);
}