package com.example.bdbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class Dboard extends AppCompatActivity implements View.OnClickListener {
    private CardView placeCardView,findCardView,workCardView ,emergencyCardView;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dboard);
        placeCardView=findViewById(R.id.placeview);
        findCardView=findViewById(R.id.findView);
        workCardView=findViewById(R.id.workView);
        emergencyCardView= findViewById(R.id.emergency_view);
        mAuth=FirebaseAuth.getInstance();




        placeCardView.setOnClickListener(this);
        findCardView.setOnClickListener(this);
        workCardView.setOnClickListener(this);
        emergencyCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.placeview)
        {
            Intent i=new Intent(Dboard.this, Selected_Divisions.class);
            startActivity(i);
        }
        else if(v.getId()== R.id.findView)
        {
            Intent i=new Intent(Dboard.this, guide_list.class);
            startActivity(i);

        }


        else if(v.getId()== R.id.workView)
        { Intent i=new Intent(Dboard.this, I_want_to_work.class);
            startActivity(i);


        }
        else if(v.getId()== R.id.emergency_view)
        { Intent i=new Intent(Dboard.this, Division.class);
            startActivity(i);


        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.signOutMenuId)
        {
            FirebaseAuth.getInstance().signOut();
            finish();
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
        else if(item.getItemId()==R.id.menuID)
        {

            Intent i=new Intent(getApplicationContext(),Dboard.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
