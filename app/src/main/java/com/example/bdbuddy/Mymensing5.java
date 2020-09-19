package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mymensing5 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing5);



        one =(PDFView)findViewById(R.id.Shashi);
        one.fromAsset("\n" +
                "Shoshi Lodge.pdf").load();
    }
}
