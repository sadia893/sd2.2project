package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Barisal_Place extends AppCompatActivity implements View.OnClickListener {

    Button kuakata ,Sonar , Fatrar , Payra , Lakhutia , barisaldm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal__place);

        kuakata =(Button) findViewById(R.id.Kuakata);
        Sonar =(Button) findViewById(R.id.Sonar);
        Fatrar =(Button) findViewById(R.id.Fatrar);
        Payra =(Button) findViewById(R.id.Payra);
        Lakhutia =(Button) findViewById(R.id.Lakhutia);
        barisaldm =(Button) findViewById(R.id.barisaldm);

        kuakata.setOnClickListener(this);
        Sonar.setOnClickListener(this);
        Fatrar.setOnClickListener(this);
        Payra.setOnClickListener(this);
        Lakhutia.setOnClickListener(this);
        barisaldm.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Kuakata:

                Intent Intent = new Intent(Barisal_Place.this, Barisal_Place1.class);
                startActivity(Intent);

                break;

            case R.id.Sonar:

                Intent aIntent = new Intent(Barisal_Place.this, Barisal_Place2.class);
                startActivity(aIntent);

                break;


            case R.id.Fatrar:

                Intent bIntent = new Intent(Barisal_Place.this, Barisal_Place3.class);
                startActivity(bIntent);

                break;

            case R.id.Payra:

                Intent cIntent = new Intent(Barisal_Place.this, Barisal_Place4.class);
                startActivity(cIntent);

                break;
            case R.id.Lakhutia:

                Intent dIntent = new Intent(Barisal_Place.this, Barisal_Place5.class);
                startActivity(dIntent);

                break;

            case R.id.barisaldm:

                Intent eIntent = new Intent(Barisal_Place.this, Barisal_Place6.class);
                startActivity(eIntent);

                break;


        }

        }
}
