package com.example.bdbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class guide_list extends AppCompatActivity {
    private ListView listView;
    DatabaseReference databaseReference;
FirebaseAuth mAuth;
    private List<User> userList;
    private userAdapter useradapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dguide);
        mAuth=FirebaseAuth.getInstance();
        databaseReference= FirebaseDatabase.getInstance().getReference("User");

        userList=new ArrayList<>();
        useradapter=new userAdapter(guide_list.this,userList);
        listView=findViewById(R.id.listViewId);
    }

   @Override
    protected void onStart() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                userList.clear();
                for(DataSnapshot snapshot: dataSnapshot.getChildren())
                {
                    User u=snapshot.getValue(User.class);
                    userList.add(u);
                }
                listView.setAdapter(useradapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        super.onStart();
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
