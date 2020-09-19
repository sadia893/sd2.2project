package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Dhaka14 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka14);

        one =(PDFView)findViewById(R.id.safari);
        one.fromAsset("Bangabandhu Sheikh Mujib Safari Park.pdf").load();
    }
}
