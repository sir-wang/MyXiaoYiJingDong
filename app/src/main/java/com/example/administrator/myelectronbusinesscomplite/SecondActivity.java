package com.example.administrator.myelectronbusinesscomplite;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment.Fragment1;
import com.example.fragment.Fragment2;
import com.example.fragment.Fragment3;
import com.example.fragment.Fragment4;

public class SecondActivity extends AppCompatActivity {

    private Fragment1 f1;
    private Fragment2 f2;
    private Fragment3 f3;
    private Fragment4 f4;

    private Button second_but_1;
    private Button second_but_2;
    private Button second_but_3;
    private Button second_but_4;
    private Button second_but_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        second_but_1 = findViewById(R.id.second_but_1);
        second_but_2 = findViewById(R.id.second_but_2);
        second_but_3 = findViewById(R.id.second_but_3);
        second_but_4 = findViewById(R.id.second_but_4);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        if(f1==null){
            f1=new Fragment1();
            transaction.add(R.id.frame,f1);
        }
        transaction.commit();

        second_but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                if(f1==null){
                    f1=new Fragment1();
                    transaction1.add(R.id.frame,f1);
                }
                hideFragmentData(transaction1);
                transaction1.show(f1);
                transaction1.commit();

                second_but_1.setBackgroundResource(R.drawable.ac1s2);
                second_but_2.setBackgroundResource(R.drawable.abwf1);
                second_but_3.setBackgroundResource(R.drawable.abug1);
                second_but_4.setBackgroundResource(R.drawable.ac2w1);
            }
        });

        second_but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                if(f2==null){
                    f2=new Fragment2();
                    transaction1.add(R.id.frame,f2);
                }
                hideFragmentData(transaction1);
                transaction1.show(f2);
                transaction1.commit();

                second_but_1.setBackgroundResource(R.drawable.ac0s1);
                second_but_2.setBackgroundResource(R.drawable.abxf2);
                second_but_3.setBackgroundResource(R.drawable.abug1);
                second_but_4.setBackgroundResource(R.drawable.ac2w1);
            }
        });

        second_but_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                if(f3==null){
                    f3=new Fragment3();
                    transaction1.add(R.id.frame,f3);
                }
                hideFragmentData(transaction1);
                transaction1.show(f3);
                transaction1.commit();

                second_but_1.setBackgroundResource(R.drawable.ac0s1);
                second_but_2.setBackgroundResource(R.drawable.abwf1);
                second_but_3.setBackgroundResource(R.drawable.abvg2);
                second_but_4.setBackgroundResource(R.drawable.ac2w1);
            }
        });

        second_but_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                if(f4==null){
                    f4=new Fragment4();
                    transaction1.add(R.id.frame,f4);
                }
                hideFragmentData(transaction1);
                transaction1.show(f4);
                transaction1.commit();

                second_but_1.setBackgroundResource(R.drawable.ac0s1);
                second_but_2.setBackgroundResource(R.drawable.abwf1);
                second_but_3.setBackgroundResource(R.drawable.abug1);
                second_but_4.setBackgroundResource(R.drawable.ac3w2);
            }
        });

    }
    //隐藏Fragment
    private void hideFragmentData(FragmentTransaction tr){
        if(!(f1==null)){
            tr.hide(f1);
        }
        if(!(f2==null)){
            tr.hide(f2);
        }
        if(!(f3==null)){
            tr.hide(f3);
        }
        if(!(f4==null)){
            tr.hide(f4);
        }

    }
}
