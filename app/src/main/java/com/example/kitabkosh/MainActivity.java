package com.example.kitabkosh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.blurry.Blurry;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv_users = findViewById(R.id.rv_users);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                RecyclerView.VERTICAL,false);

        UserAdapter userAdapter = new UserAdapter(this,getUserList());

        rv_users.setLayoutManager(linearLayoutManager);
        rv_users.setHasFixedSize(true);

        rv_users.setAdapter(userAdapter);

    }

    private List<User> getUserList() {
        List<User> users = new ArrayList<>();

        User user1 = new User("KARTIK MISHRA","@kartik",
                "https://images.unsplash.com/photo-1518806118471-" +
                        "f28b20a1d79d?ixlib=rb-1.2.1&ixid=" +
                        "eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1900&q=80","1",
                "GREENFIELDS PUBLIC SCHOOL","6",
                "https://images-na.ssl-images-amazon.com/images/I/91f4O%2B-Mb-L.jpg");

        User user2 = new User("RISHABH SHARMA","@rish",
                "https://images.unsplash.com/photo-1529665253569-6d01c0eaf7b6?ixlib=" +
                        "rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=976&q=80",
                "1",
                "GREENWAY PUBLIC SCHOOL","7","https://www.raajkart." +
                "com/media/catalog/product/cache/1" +
                "/image/800x800/9df78eab33525d08d6e5fb8d27136e95/1/2/120_16.jpg");

        User user3 = new User("SHAKSHI","@skshi",
                "https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib" +
                        "=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1868&q=80",
                "1", "GREENFIELDS PUBLIC SCHOOL","11",
                "https://schoolkart.s3.amazonaws.com/catalog/product/cache/1/image" +
                        "/600x600/9df78eab33525d08d6e5fb8d27136e95/5/1/51_gzbe1kul.jpg");

        User user4 = new User("KEVIN HART","@kevh",
                "https://images.unsplash.com/photo-1531427186611-ecfd6d936c79?ixlib=rb" +
                        "-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","1",
                "GREENFIELDS PUBLIC SCHOOL","12","");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }
}
