package com.example.administrator.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class test3Activity extends AppCompatActivity {
    public static void actionStart(Context context) {
        Intent intent = new Intent(context,test3Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        context.startActivity(intent);
    }

    public TextView test3Text;
    public String cp3="第三个产品";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);

        test3Text= findViewById(R.id.test3view);
        test3Text.setText(cp3);
    }
}
