package com.example.vothanhtrung_shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        View btnbutton = findViewById(R.id.textView12);
        Button btnlogin = findViewById(R.id.button4);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đây là nơi bạn xử lý logic đăng nhập
                // Ví dụ: kiểm tra thông tin đăng nhập, xác thực, ...

                // Sau khi xử lý logic đăng nhập, bạn có thể chuyển trang bằng cách sử dụng Intent
                Intent intent = new Intent(LoginActivity.this, MainActivity.class); // Thay HomeActivity bằng tên activity bạn muốn chuyển đến
                startActivity(intent);
            }
        });

        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignActivity.class);
                startActivity(intent);
            }
        });
    }
}
