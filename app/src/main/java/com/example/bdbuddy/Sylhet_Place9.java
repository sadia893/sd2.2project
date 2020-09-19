package com.example.bdbuddy;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Sylhet_Place9 extends AppCompatActivity implements View.OnClickListener{
    RadioButton sm9,s9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place9);

        sm9 =(RadioButton) findViewById(R.id.malnicherramap);
        sm9.setOnClickListener(this);


        s9 =(RadioButton) findViewById(R.id.malnicherraweather);
        s9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.malnicherramap:

                Intent Intent = new Intent(Sylhet_Place9.this, Maps_Sylhet9.class);
                startActivity(Intent);

                break;

            case R.id.malnicherraweather:

                Intent aIntent = new Intent(Sylhet_Place9.this, Sylhet9.class);
                startActivity(aIntent);

                break;
        }
    }
}
