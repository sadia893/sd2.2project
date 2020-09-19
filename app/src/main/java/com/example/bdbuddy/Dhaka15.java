package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Dhaka15 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka15);

        one =(PDFView)findViewById(R.id.zoo);
        one.fromAsset("Bangladesh National Zoo.pdf").load();
    }
}
