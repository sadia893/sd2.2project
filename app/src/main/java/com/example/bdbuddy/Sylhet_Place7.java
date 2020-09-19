package com.example.bdbuddy;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Sylhet_Place7 extends AppCompatActivity implements View.OnClickListener {

    RadioButton sm7 ,s7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place7);
        sm7 =(RadioButton) findViewById(R.id.Lovamap);
        sm7.setOnClickListener(this);


        s7 =(RadioButton) findViewById(R.id.Lovaweather);
        s7.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Lovamap:

                Intent Intent = new Intent(Sylhet_Place7.this, Maps_Sylhet7.class);
                startActivity(Intent);

                break;

            case R.id.Lovaweather:

                Intent aIntent = new Intent(Sylhet_Place7.this, Sylhet7.class);
                startActivity(aIntent);

                break;
        }
    }
}
