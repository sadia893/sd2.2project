package com.example.bdbuddy;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class userAdapter extends ArrayAdapter<User> {
    private Activity context;
    private List<User> userList;

    public userAdapter(Activity context,List<User> userList) {
        super(context,R.layout.sample_layout,userList);
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.sample_layout,null,true);
        User user=userList.get(position);
        TextView t1=view.findViewById(R.id.nameTextViewId);
        TextView t2=view.findViewById(R.id.usernameTextViewId);
        TextView t3=view.findViewById(R.id.emailTextViewId);
        TextView t4=view.findViewById(R.id.ageTextViewId);
        TextView t5=view.findViewById(R.id.addressTextViewId);
        TextView t6=view.findViewById(R.id.yearTextViewId);
        TextView t7=view.findViewById(R.id.RateTextViewId);
        TextView t8=view.findViewById(R.id.LanguagesTextViewId);
        TextView t9=view.findViewById(R.id.areasTextViewId);
        TextView t10=view.findViewById(R.id.aboutTextViewId);
        TextView t11=view.findViewById(R.id.profTextViewId);
        t1.setText("Hello! This is "+user.getName());
        t2.setText("You can reach me at "+user.getUsername());
        t3.setText("My email address : "+user.getEmail());
        t4.setText("I am "+user.getAge()+" years old");
        t5.setText("I lives in "+user.getAddress());
        t6.setText("I am working in this field for "+user.getExperiance());
        t7.setText("I will take "+user.getRate()+" BDT to guide you for an hour ");
        t8.setText("I know "+user.getLanguages());
        t9.setText("I can guide you around these places :"+user.getAreas());
        t10.setText("Here is a short note about me : "+user.getAbout());
        t11.setText("***I am "+user.getProfes()+"***");

        return view;
    }
}
