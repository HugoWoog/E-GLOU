package com.example.hwoog.e_glou;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {


    private EditText nomEditText;
    private EditText prenomEditText;
    private Button Butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        setUpNewViews();
        Butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startFirstActivity();
                //finish();
            }
        });
    }

    private void setUpNewViews(){ //on instancie les champs text
        nomEditText = (EditText) findViewById(R.id.editText);
        prenomEditText = (EditText) findViewById(R.id.editText2);
        Butt2 = (Button) findViewById(R.id.button);
    }

    private void startFirstActivity(){
        Intent intent = new Intent(SignUpActivity.this, MenuActivity.class);
        startActivity(intent);
    }


}
