package com.example.administrator.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class test2Activity extends AppCompatActivity {
    public static void actionStart(Context context) {
        Intent intent = new Intent(context,test2Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        context.startActivity(intent);
    }

    public TextView test2Text;
    public String cp2="第二个产品";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        test2Text= findViewById(R.id.test2view);
        test2Text.setText(cp2);
    }
}
