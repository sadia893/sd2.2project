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

public class Sign_in extends AppCompatActivity implements View.OnClickListener {
private Button signUp,login,fp;
private EditText email,password;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mAuth = FirebaseAuth.getInstance();
        login=findViewById(R.id.login_id);
        signUp=findViewById(R.id.signup_id);
        fp=findViewById(R.id.fp_id);
        email=findViewById(R.id.email_id);
        password=findViewById(R.id.password_id);
        login.setOnClickListener(this);
        signUp.setOnClickListener(this);
        fp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.login_id)
        { userLogin();

        }
        else if(v.getId()==R.id.signup_id)
        {
            Intent i=new Intent(Sign_in.this,Sign_up.class);
            startActivity(i);

        }
        else if(v.getId()==R.id.fp_id)
        {
            forgetPassword();
        }

    }

    private void forgetPassword() {
        String m=email.getText().toString();
        mAuth.sendPasswordResetEmail(m).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), "Reset link sent to your email", Toast.LENGTH_SHORT).show();

                }else
                    Toast.makeText(getApplicationContext(), "Password reset  unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void userLogin() {
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
            password.setError("wrong password");
            password.requestFocus();
            return;
        }
        mAuth.signInWithEmailAndPassword(e,p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Intent i = new Intent(Sign_in.this, Dboard.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Sign in  unsuccessful", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
