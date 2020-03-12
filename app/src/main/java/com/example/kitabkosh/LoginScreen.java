package com.example.kitabkosh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    EditText user_et,password_et;
    Button log_in;
    TextView sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        user_et = findViewById(R.id.et_user);
        password_et = findViewById(R.id.et_password);
        log_in = findViewById(R.id.btn_login);
        sign_up = findViewById(R.id.text_sign_up);


        final String[] userName = {null};
        final String[] password = {null};


        user_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                userName[0] = editable.toString();
            }
        });

        password_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
               password[0] = editable.toString();
            }
        });


        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sp1= getSharedPreferences("Login",MODE_PRIVATE);
                String unm=sp1.getString("Username", "not found");
                String pass = sp1.getString("Password", "not found");
                Log.d("UserName", unm);
                Log.d("password", pass);

                if(userName[0].equals(unm) && password[0].equals(pass)) {
                        Intent intent = new Intent(LoginScreen.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                 else  {
                    Toast.makeText(LoginScreen.this, "Invalid Username or Password!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, SignUpScreen.class);
                startActivity(intent);
            }
        });
    }
}
