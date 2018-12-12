package com.example.devsawe.horntech.auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.devsawe.horntech.Home;
import com.example.devsawe.horntech.R;

public class SignIn extends AppCompatActivity {

    Button homebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        homebtn = findViewById(R.id.btn_sign_in);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
