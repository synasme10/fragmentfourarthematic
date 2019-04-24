package com.example.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Fragment.FirstFragment;
import Fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button BtnFragment;
    private Boolean status=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnFragment = findViewById(R.id.BtnFragment);
        BtnFragment.setOnClickListener(this);

    }

    public void onClick(View v){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if (status) {
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.add(R.id.fragmentcontainer, firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            BtnFragment.setText("Load Second Fragment");
            status = false;

        }
        else
        {

                SecondFragment secondFragment=new SecondFragment();
                fragmentTransaction.add(R.id.fragmentcontainer,secondFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                BtnFragment.setText("Load First Fragment");
                status=true;


            }


        }
    }


