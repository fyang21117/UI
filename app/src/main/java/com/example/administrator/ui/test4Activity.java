package com.example.administrator.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class test4Activity extends AppCompatActivity {
    public static void actionStart(Context context) {
        Intent intent = new Intent(context,test4Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        context.startActivity(intent);
    }

    public TextView test4Text;
    public String cp4="第四个产品";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4);

        test4Text= findViewById(R.id.test4view);
        test4Text.setText(cp4);
    }
}
