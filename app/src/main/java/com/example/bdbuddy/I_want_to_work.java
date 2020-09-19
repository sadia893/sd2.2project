package com.example.bdbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class I_want_to_work extends AppCompatActivity {
    private Button submitButton;
    private EditText name,username,email,age,rate,languages,areas,about;
    private Spinner address,experience,prof;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_want_to_work);
        mAuth=FirebaseAuth.getInstance();

        name=findViewById(R.id.workName_id);
        username=findViewById(R.id.workUsername_id);
        email=findViewById(R.id.workEmail_id);
        age=findViewById(R.id.workAge_id);
        rate=findViewById(R.id.workRate_id);
        languages=findViewById(R.id.worklang_id);
        areas=findViewById(R.id.workareas_id);
        about=findViewById(R.id.workAbout_id);
        address=findViewById(R.id.spinner_div);
        experience=findViewById(R.id.spinner_years);
        prof=findViewById(R.id.spinner_p);
        submitButton=findViewById(R.id.submit_id);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ame,uname,mail,ge,ate,anguages,reas,bout,rofes,ddress,xperiance;

                //FirebaseDatabase.getInstance().getReference().child("prog knowledge").child("Astudio").setValue("abcd");
                rootNode=FirebaseDatabase.getInstance();
                reference=rootNode.getReference("User");
                ame=name.getText().toString().trim();
                uname=username.getText().toString().trim();
                mail=email.getText().toString().trim();
                ge=age.getText().toString().trim();
                ate=rate.getText().toString().trim();
                anguages=languages.getText().toString().trim();
                reas=areas.getText().toString().trim();
                bout=about.getText().toString().trim();
                rofes=prof.getSelectedItem().toString().trim();
                ddress=address.getSelectedItem().toString().trim();
                xperiance=experience.getSelectedItem().toString().trim();
                if (ame.isEmpty()) {
                    name.setError("enter your name");
                    name.requestFocus();
                    return;

                }
                if (uname.isEmpty() || uname.length() < 13 || uname.length()>13) {
                    username.setError("enter  a valid number ");
                    username.requestFocus();
                    return;

                }
                if (mail.isEmpty()) {
                    email.setError("enter an email address");
                    email.requestFocus();
                    return;

                }
                if (!Patterns.EMAIL_ADDRESS.matcher(mail).matches()) {
                    email.setError("enter a valid email address");
                    email.requestFocus();
                    return;
                }


                if (ge.isEmpty()) {
                    age.requestFocus();
                    return;

                }
                if (ate.isEmpty()) {
                    rate.requestFocus();
                    return;

                }
                if (anguages.isEmpty()) {
                    languages.requestFocus();
                    return;

                }
                if (reas.isEmpty()) {
                    areas.requestFocus();
                    return;

                }
                if (bout.isEmpty()) {
                    about.requestFocus();
                    return;

                }


                User u=new User(ame,uname,mail,ge,ate,anguages,reas,bout,rofes,ddress,xperiance);
                reference.child(uname).setValue(u);
                Toast.makeText(getApplicationContext(), "Your information is added", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(I_want_to_work.this, Dboard.class);
                startActivity(i);

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.signOutMenuId)
        {
            FirebaseAuth.getInstance().signOut();
            finish();
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
        else if(item.getItemId()==R.id.menuID)
        {

            Intent i=new Intent(getApplicationContext(),Dboard.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
