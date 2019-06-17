package com.rktuhinbd.retrofit_java.View;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.rktuhinbd.retrofit_java.Model.API;
import com.rktuhinbd.retrofit_java.Model.Post;
import com.rktuhinbd.retrofit_java.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.txt);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.9:8000/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API api = retrofit.create(API.class);

        Call<List<Post>> call = api.getPosts();

        call.enqueue(new Callback<List<Post>>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (!response.isSuccessful()){
                    textView.setText("Code: " + response.code());
                    return;
                }else{
                    List<Post> posts = response.body();

                    Log.e("Message: " , response.raw()+"");
                    for (Post post : posts){
                        String content = "Product ID: " + post.getProductId() + "\n"
                                + "Product Name: " + post.getProductName() + "\n"
                                + "Product Price: " + post.getProductPrice() + "\n"
                                + "Product ISBN: " + post.getProductIsbn() + "\n"
                                + "Product Barcode: " + post.getProductBarcode() + "\n"
                                + "Product Created: " + post.getProductCreated() + "\n"
                                + "Product Updated: " + post.getProductUpdated() + "\n"
                                + "Product Relation: " + post.getProductMasterProductAttributeRelation() + "\n\n";

                        textView.append(content);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });
    }
}
