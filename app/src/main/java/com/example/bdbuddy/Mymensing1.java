package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mymensing1 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing1);


        one =(PDFView)findViewById(R.id.Shilpacharya);
        one.fromAsset("\n" +
                "Zainul Abedin Sangrahashala.pdf").load();
    }
}
