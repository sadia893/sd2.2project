package com.example.bdbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;


public class Division extends AppCompatActivity implements View.OnClickListener  {


    Button Dhaka , Rajshahi,Chittagong,Sylhet,Barisal,Khulna,Rangpur,Mymensing ;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        mAuth=FirebaseAuth.getInstance();
        Dhaka = (Button) findViewById(R.id.Dhaka);
        Rajshahi =(Button) findViewById(R.id.Rajshahi);
        Chittagong =(Button) findViewById(R.id.Chittagong);
        Sylhet =(Button) findViewById(R.id.Sylhet);
        Barisal =(Button) findViewById(R.id.Borishal);
        Khulna =(Button) findViewById(R.id.Khulna);
        Mymensing =(Button) findViewById(R.id.Mymensing);
        Rangpur =(Button) findViewById(R.id.Rangpur);


        Dhaka.setOnClickListener(this);
        Rajshahi.setOnClickListener(this);
        Chittagong.setOnClickListener(this);
        Sylhet.setOnClickListener(this);
        Barisal.setOnClickListener(this);
        Khulna.setOnClickListener(this);
        Mymensing.setOnClickListener(this);
        Rangpur.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.Dhaka:

                Intent Intent = new Intent(Division.this, EmergecyDhaka.class);
                startActivity(Intent);

                break;

            case R.id.Rajshahi:

                Intent aIntent = new Intent(Division.this, EmergencyRajshahi.class);
                startActivity(aIntent);

                break;


            case R.id.Sylhet:

                Intent bIntent = new Intent(Division.this, EmergencySylhet.class);
                startActivity(bIntent);

                break;

            case R.id.Borishal:

                Intent cIntent = new Intent(Division.this, EmergencyBarisal.class);
                startActivity(cIntent);

                break;
            case R.id.Chittagong:

                Intent dIntent = new Intent(Division.this, EmergencyChittagong.class);
                startActivity(dIntent);

                break;

            case R.id.Khulna:

                Intent eIntent = new Intent(Division.this, EmergencyKhulna.class);
                startActivity(eIntent);

                break;
            case R.id.Rangpur:

                Intent fIntent = new Intent(Division.this, EmergencyRangpur.class);
                startActivity(fIntent);

                break;

            case R.id.Mymensing:

                Intent gIntent = new Intent(Division.this, EmergencyMymensing.class);
                startActivity(gIntent);

                break;



        }

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
