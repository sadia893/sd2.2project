package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sign_up extends AppCompatActivity implements View.OnClickListener {
    private  Button signup,signin;
    private EditText name,username,email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup=findViewById(R.id.signu_id);
        signin=findViewById(R.id.signi_id);
        signup.setOnClickListener(this);
        signin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.signu_id)
        {

        }
        else if(v.getId()==R.id.signi_id)
        {
            Intent i=new Intent(Sign_up.this,Sign_in.class);
            startActivity(i);

        }
    }
}
