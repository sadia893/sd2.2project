package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Sylhet_Place6 extends AppCompatActivity implements View.OnClickListener{
    RadioButton sm6 ,s6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place6);
        sm6 =(RadioButton) findViewById(R.id.Bisnakandimap);
        sm6.setOnClickListener(this);


        s6 =(RadioButton) findViewById(R.id.Bisnakandiather);
        s6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.Bisnakandimap:

                Intent Intent = new Intent(Sylhet_Place6.this, Maps_Sylhet6.class);
                startActivity(Intent);

                break;

            case R.id.Bisnakandiather:

                Intent aIntent = new Intent(Sylhet_Place6.this, Sylhet6.class);
                startActivity(aIntent);

                break;
        }
    }
}
