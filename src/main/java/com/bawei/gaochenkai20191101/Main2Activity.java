package com.bawei.gaochenkai20191101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("aa","B   "+"onStart");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("aa","B   "+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("aa","B   "+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("aa","B   "+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("aa","B   "+"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("aa","B   "+"onRestart");
    }
}
