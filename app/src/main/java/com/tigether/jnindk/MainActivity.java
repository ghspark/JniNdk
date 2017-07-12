package com.tigether.jnindk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.tigether.jnindk.jni.HelloJni;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    public void initData() {
        Toast.makeText(getApplicationContext(), new HelloJni().sayHello(), Toast.LENGTH_SHORT).show();
    }
}
