package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Dhaka10 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka10);

        one =(PDFView)findViewById(R.id.dhakeshari);
        one.fromAsset("Dhakeshwari National Temple.pdf").load();
    }
}
