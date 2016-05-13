package com.example.hwoog.e_glou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText nomEditText;
    private EditText prenomEditText;
    private Button Butt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        setUpViews();

        Butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startSecondActivity();

                //finish();
            }
        });
    }

    private void startSecondActivity(){
        Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(intent);
    }


    private void setUpViews(){ //on instancie les champs text
        nomEditText = (EditText) findViewById(R.id.editText);
        prenomEditText = (EditText) findViewById(R.id.editText2);
        Butt1 = (Button) findViewById(R.id.button);
    }
}
