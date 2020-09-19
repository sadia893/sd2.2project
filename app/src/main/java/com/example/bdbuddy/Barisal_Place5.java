package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Barisal_Place5 extends AppCompatActivity implements View.OnClickListener {
    RadioButton bm5 , b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal__place5);

        bm5 =(RadioButton) findViewById(R.id.Lakhutiamap);
        bm5.setOnClickListener(this);


        b5 =(RadioButton) findViewById(R.id.Lakhutiaweather);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.Lakhutiamap:

                Intent Intent = new Intent(Barisal_Place5.this, Maps_Barisal5.class);
                startActivity(Intent);

                break;

            case R.id.Lakhutiaweather:

                Intent aIntent = new Intent(Barisal_Place5.this, Barisal5.class);
                startActivity(aIntent);

                break;
        }

    }
}


