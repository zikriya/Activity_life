package com.example.zikii.activity_life;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv;
static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    tv=(TextView) findViewById(R.id.Counter);
        //tv.setOnClickListener(new On);
    //tv.setText(""+count);
    }

    public void next(View view){
        Intent in=new Intent(MainActivity.this,Second.class);
        startActivity(in);
          //show();
    }
public void show(){
    //tv.setText("updated");
}
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("This is onStart()", "working");
        Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("This is onReStart()", "working");
        Toast.makeText(getApplicationContext(),"ReStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("This is onPause()", "working");
        Toast.makeText(getApplicationContext(),"Pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("This is onStop()", "working");
        Toast.makeText(getApplicationContext(),"Stop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("This is onResume()", "working");
        Toast.makeText(getApplicationContext(),"Resume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("This is onDestroy()", "working");
        Toast.makeText(getApplicationContext(),"Destroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        tv.setText(""+count++);
        outState.putString("SHOW",tv.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
     tv.setText(savedInstanceState.getString("SHOW"));
    }
}
