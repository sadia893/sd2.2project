package com.example.bdbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;

public class Selected_Divisions extends AppCompatActivity {
    Spinner spinnerexample;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected__divisions);
        mAuth=FirebaseAuth.getInstance();
        final Spinner spinner = (Spinner) findViewById(R.id.spinner_example);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.division, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        // this will be called when you select any item in this spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View arg1, int position, long arg3) {
                // get the text at that position
                String Text = spinner.getSelectedItem().toString();
               if (Text.equals("Barisal")) {
                    Intent NewPost = new Intent(Selected_Divisions.this, Barisal.class);
                    startActivity(NewPost);
                }
                if (Text.equals("Dhaka")) {
                    Intent NewPost = new Intent(Selected_Divisions.this, Dhaka.class);
                    startActivity(NewPost);
                }
                if (Text.equals("Rajshahi")) {
                      Intent NewPost = new Intent(Selected_Divisions.this, Rajshahi.class);
                       startActivity(NewPost);
                }
                if (Text.equals("Khulna")) {
                      Intent NewPost = new Intent(Selected_Divisions.this, Khulna.class);
                      startActivity(NewPost);
                }
                if (Text.equals("Chittagong")) {
                      Intent NewPost = new Intent(Selected_Divisions.this, Chittagong.class);
                      startActivity(NewPost);
                }
                if (Text.equals("Sylhet")) {
                     Intent NewPost = new Intent(Selected_Divisions.this, Sylhet.class);
                     startActivity(NewPost);
                }
                if (Text.equals("Rangpur")) {
                     Intent NewPost = new Intent(Selected_Divisions.this, Rangpur.class);
                     startActivity(NewPost);
                }
                if (Text.equals("Mymensing")) {
                     Intent NewPost = new Intent(Selected_Divisions.this, Mymensing.class);
                     startActivity(NewPost);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
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
