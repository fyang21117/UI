package com.example.administrator.ui;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button CP1,CP2,CP3,CP4;
//    private TextView TestText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

 //       TestText = findViewById(R.id.testview);
        CP1 = findViewById(R.id.cp1);
        CP2 = findViewById(R.id.cp2);
        CP3 = findViewById(R.id.cp3);
        CP4 = findViewById(R.id.cp4);
        CP1.setOnClickListener(this);
        CP2.setOnClickListener(this);
        CP3.setOnClickListener(this);
        CP4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {   String cp1="第一个产品";
        String cp2="第二个产品";
        String cp3="第三个产品";
        String cp4="第四个产品";
        switch (v.getId())
        {
            case R.id.cp1:
                {
 //                   TestText.setText(cp1);
                    Intent i1 = new Intent(MainActivity.this,testActivity.class);
                    startActivity(i1);
                    break;}
            case R.id.cp2:
            {
//                TestText.setText(cp2);
                Intent i2 = new Intent(MainActivity.this,testActivity.class);
                startActivity(i2);
                break;}
            case R.id.cp3:
            {
 //               TestText.setText(cp3);
                Intent i3 = new Intent(MainActivity.this,testActivity.class);
                startActivity(i3);
                break;}
            case R.id.cp4:
            {
//                TestText.setText(cp4);
                Intent i4 = new Intent(MainActivity.this,testActivity.class);
                startActivity(i4);
                break;}
        default :break;
         }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
            {
                finish();
            }break;

            case R.id.add_item:
            {

            }break;
            default :break;
        }
        return super.onOptionsItemSelected(item);
    }
}
