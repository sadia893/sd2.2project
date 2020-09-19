package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Sylhet_Place4 extends AppCompatActivity implements View.OnClickListener {

    RadioButton sm4 ,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place4);
        sm4 =(RadioButton) findViewById(R.id.SREEMANGALmap);
        sm4.setOnClickListener(this);


        s4 =(RadioButton) findViewById(R.id.SREEMANGALweather);
        s4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.SREEMANGALmap:

                Intent Intent = new Intent(Sylhet_Place4.this, Maps_Sylhet4.class);
                startActivity(Intent);

                break;

            case R.id.SREEMANGALweather:

                Intent aIntent = new Intent(Sylhet_Place4.this, Sylhet4.class);
                startActivity(aIntent);

                break;
        }
    }
}
