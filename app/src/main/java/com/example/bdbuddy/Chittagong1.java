package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chittagong1 extends AppCompatActivity {
PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong1);

        one =(PDFView)findViewById(R.id.Foy);
        one.fromAsset("Foy.pdf").load();
    }
}
