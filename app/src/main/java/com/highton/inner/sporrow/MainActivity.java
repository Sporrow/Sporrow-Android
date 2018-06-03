package com.highton.inner.sporrow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.highton.inner.sporrow.login.LoginPage;
import com.highton.inner.sporrow.login.RegisterUser;

public class MainActivity extends AppCompatActivity{

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        findViewById(R.id.iv_btnGoLoginPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginPage.class));
            }
        });
        findViewById(R.id.iv_btnRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterUser.class));
            }
        });
        iv = findViewById(R.id.iv_logo2);
        Glide.with(getApplicationContext()).load(R.drawable.app_logo).into(iv);
    }
}
