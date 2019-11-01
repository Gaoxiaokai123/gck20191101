package com.bawei.gaochenkai20191101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.main_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
        Log.e("aa","A   "+"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("aa","A   "+"onStart");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("aa","A   "+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("aa","A   "+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("aa","A   "+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("aa","A   "+"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("aa","A   "+"onRestart");
    }
}
