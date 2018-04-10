package com.example.administrator.myelectronbusinesscomplite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    int y=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(){
            @Override
            public void run() {
                super.run();
                for(int i=0;i<y;i++){
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
        //Toast.makeText(MainActivity.this,"跳过了",Toast.LENGTH_SHORT).show();
    }
}
