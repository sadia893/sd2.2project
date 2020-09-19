package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Sylhet_Place10 extends AppCompatActivity implements View.OnClickListener{

    RadioButton sm10 , s10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place10);
        sm10 =(RadioButton) findViewById(R.id.kalamap);
        sm10.setOnClickListener(this);


        s10 =(RadioButton) findViewById(R.id.kalaweather);
        s10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.kalamap:

                Intent Intent = new Intent(Sylhet_Place10.this, Maps_Sylhet10.class);
                startActivity(Intent);

                break;

            case R.id.kalaweather:

                Intent aIntent = new Intent(Sylhet_Place10.this, Sylhet10.class);
                startActivity(aIntent);

                break;
        }
    }
}
