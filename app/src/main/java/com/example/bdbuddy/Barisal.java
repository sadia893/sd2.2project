package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Barisal extends AppCompatActivity implements View.OnClickListener {
    RadioButton br1 ,bf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal);
        br1 = (RadioButton) findViewById(R.id.barplace);
        bf1 =(RadioButton)findViewById(R.id.barfood);


        br1.setOnClickListener(this);
        bf1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.barplace:

                Intent Intent = new Intent(Barisal.this, Barisal_Place.class);
                startActivity(Intent);

                break;

            case R.id.barfood:

                Intent aIntent = new Intent(Barisal.this, Barisalfood.class);
                startActivity(aIntent);

                break;


        }


    }


}
