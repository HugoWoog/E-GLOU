package com.example.hwoog.e_glou;

import android.widget.Button;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hwoog.e_glou.LoginActivity;
import com.example.hwoog.e_glou.R;
import com.example.hwoog.e_glou.SignUpActivity;

public class HomeActivity extends AppCompatActivity {

    private Button Butt1;
    private Button Butt2;
    private TextView Salut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setUpViews();

        Butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startLoginActivity();

                //finish();
            }
        });

        Butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startSignUpActivity();

                //finish();
            }
        });
    }


    private void setUpViews(){ //on instancie les champs text
        Butt1 = (Button) findViewById(R.id.button1);
        Butt2 = (Button) findViewById(R.id.button2);
        Salut = (TextView) findViewById(R.id.salut);
    }

    private void startLoginActivity(){
        Intent intent1 = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent1);
    }

    private void startSignUpActivity(){
        Intent intent2 = new Intent(HomeActivity.this, SignUpActivity.class);
        startActivity(intent2);
    }



}
