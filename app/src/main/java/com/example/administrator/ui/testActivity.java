package com.example.administrator.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class testActivity extends AppCompatActivity {
    public static void actionStart(Context context) {
        Intent intent = new Intent(context,testActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        context.startActivity(intent);
    }

    public TextView testText;
    public String cp1="第一个产品";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        testText= findViewById(R.id.testview);
        testText.setText(cp1);
    }
}
