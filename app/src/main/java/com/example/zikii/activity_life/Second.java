package com.example.zikii.activity_life;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {
Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        back= (Button) findViewById(R.id.back);

    }
    public void back(View view){
        Intent in=new Intent(Second.this,MainActivity.class);
        startActivity(in);

    }
}
