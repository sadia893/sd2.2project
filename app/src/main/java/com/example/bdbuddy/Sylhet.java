package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Sylhet extends AppCompatActivity implements View.OnClickListener{

    RadioButton s ,sf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);

        s =(RadioButton) findViewById(R.id.sylplace);
        sf=(RadioButton)findViewById(R.id.sylfood);
        s.setOnClickListener(this);
        sf.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.sylplace:

                Intent Intent = new Intent(Sylhet.this, Sylhet_Place.class);
                startActivity(Intent);

                break;

            case R.id.sylfood:

                Intent aIntent = new Intent(Sylhet.this, Sylhetfood.class);
                startActivity(aIntent);

                break;

        }
        }
}
