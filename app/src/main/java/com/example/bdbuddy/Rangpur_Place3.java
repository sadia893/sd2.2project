package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rangpur_Place3 extends AppCompatActivity implements View.OnClickListener {

    RadioButton rang3 ,ra3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__place3);
        rang3 =(RadioButton) findViewById(R.id.Nayabadmap);
        rang3.setOnClickListener(this);

        ra3 =(RadioButton) findViewById(R.id.Nayabadweather);
        ra3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Nayabadmap:

                Intent Intent = new Intent(Rangpur_Place3.this, Maps_Rangpur3.class);
                startActivity(Intent);

                break;

            case R.id.Nayabadweather:

                Intent aIntent = new Intent(Rangpur_Place3.this, Rangpur3.class);
                startActivity(aIntent);

                break;


        }
    }
}
