package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_in extends AppCompatActivity implements View.OnClickListener {
private Button signIn,signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        signIn=findViewById(R.id.login_id);
        signUp=findViewById(R.id.signup_id);
        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.login_id)
        { Intent i=new Intent(Sign_in.this,MainActivity.class);
            startActivity(i);

        }
        else if(v.getId()==R.id.signup_id)
        {
            Intent i=new Intent(Sign_in.this,Sign_up.class);
            startActivity(i);

        }

    }
}
