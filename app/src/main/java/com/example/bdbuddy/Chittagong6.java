package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chittagong6 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong6);

        one =(PDFView)findViewById(R.id.Nilachal);
        one.fromAsset("Nilachal.pdf").load();
    }
}
