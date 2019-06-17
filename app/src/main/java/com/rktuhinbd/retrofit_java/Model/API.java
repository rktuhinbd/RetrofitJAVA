package com.rktuhinbd.retrofit_java.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    @GET("product/list")
    Call<List<Post>> getPosts();
}
