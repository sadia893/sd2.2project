package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView placeCardView,findCardView,workCardView ,emergencyCardView,sign_inCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placeCardView=findViewById(R.id.placeview);
        findCardView=findViewById(R.id.findView);
        workCardView=findViewById(R.id.workView);
        emergencyCardView= findViewById(R.id.emergency_view);
        sign_inCardView=findViewById(R.id.sign_in_view);




        placeCardView.setOnClickListener(this);
        findCardView.setOnClickListener(this);
        workCardView.setOnClickListener(this);
        emergencyCardView.setOnClickListener(this);
        sign_inCardView.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.placeview)
        {
            Intent i=new Intent(MainActivity.this,Selected_Divisions.class);
            startActivity(i);
        }
         else if(v.getId()==R.id.findView)
        {
            Intent i=new Intent(MainActivity.this,guide_list.class);
            startActivity(i);

        }


        else if(v.getId()==R.id.workView)
        { Intent i=new Intent(MainActivity.this,I_want_to_work.class);
            startActivity(i);


        }
        else if(v.getId()==R.id.emergency_view)
        { Intent i=new Intent(MainActivity.this,Division.class);
            startActivity(i);


        }

        else if(v.getId()==R.id.sign_in_view)
        { Intent i=new Intent(MainActivity.this,Sign_in.class);
            startActivity(i);


        }


    }
}
