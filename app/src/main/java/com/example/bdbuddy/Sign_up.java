package com.example.bdbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class Sign_up extends AppCompatActivity implements View.OnClickListener {
    private  Button signup,signin;
    private FirebaseAuth mAuth;
    private EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mAuth = FirebaseAuth.getInstance();
        signup=findViewById(R.id.signu_id);
        signin=findViewById(R.id.signi_id);
        signup.setOnClickListener(this);
        signin.setOnClickListener(this);
        email=findViewById(R.id.email_id);
        password=findViewById(R.id.password_id);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.signu_id)
        { 
            userRegister();

        }
        else if(v.getId()==R.id.signi_id)
        {
            Intent i=new Intent(Sign_up.this,Sign_in.class);
            startActivity(i);

        }
    }

    private void userRegister() {
        String e=email.getText().toString().trim();
        String p=password.getText().toString().trim();

        if(e.isEmpty())
        {email.setError("enter an email address");
            email.requestFocus();
            return;

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(e).matches())
        {
            email.setError("enter a valid email address");
            email.requestFocus();
            return;
        }

        if(p.isEmpty())
        {password.setError("enter  a password ");
            password.requestFocus();
            return;

        }
        if(p.length()<6)
        {
            password.setError("minimum length of a password should be 6");
            password.requestFocus();
            return;
        }
        mAuth.createUserWithEmailAndPassword(e,p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(),"Sign up is successful",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Sign_up.this,Sign_in.class);
                    startActivity(i);

                } else {
                    if(task.getException() instanceof FirebaseAuthUserCollisionException)
                        Toast.makeText(getApplicationContext(),"User is already registered",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(getApplicationContext(),"Error:"+task.getException().getMessage(),Toast.LENGTH_SHORT);

                }
            }
        });
    }
}
