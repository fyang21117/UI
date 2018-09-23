package com.example.administrator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity
    implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button psw_login = findViewById(R.id.psw_login);
        psw_login.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                MainActivity.actionStart(this);
            }
}
