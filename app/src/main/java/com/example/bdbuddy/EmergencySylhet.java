package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class EmergencySylhet extends AppCompatActivity {


    ArrayList<String>original_data1 = new ArrayList<>();

    ArrayList<String>original_data2 = new ArrayList<>();

    ArrayList<String>original_data3 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergecy_dhaka);
        TextView   doriginal_text1 = (TextView)findViewById(R.id.dhakaoriginal_text1);

        TextView   doriginal_text2 = (TextView)findViewById(R.id.dhakaoriginal_text2);

        TextView   doriginal_text3 = (TextView)findViewById(R.id.dhakaoriginal_text3);


        //Load from raw folder

        Scanner data_in = new Scanner((getResources().openRawResource(R.raw.sylhet1)));
        while(data_in.hasNext())
        {
            original_data1.add(data_in.nextLine());
        }
        doriginal_text1.setText(("  "));
        for(int i=0;i<original_data1.size();i++)
        {
            doriginal_text1.append(original_data1.get(i)+ "\n");
        }



        Scanner data_in1 = new Scanner((getResources().openRawResource(R.raw.sylhet2)));
        while(data_in1.hasNext())
        {
            original_data2.add(data_in1.nextLine());
        }
        doriginal_text2.setText(("  "));
        for(int i=0;i<original_data2.size();i++)
        {
            doriginal_text2.append(original_data2.get(i)+ "\n");
        }




        Scanner data_in3 = new Scanner((getResources().openRawResource(R.raw.sylhet3)));
        while(data_in3.hasNext())
        {
            original_data3.add(data_in3.nextLine());
        }
        doriginal_text3.setText(("  "));
        for(int i=0;i<original_data3.size();i++)
        {
            doriginal_text3.append(original_data3.get(i)+ "\n");
        }


    }
}
