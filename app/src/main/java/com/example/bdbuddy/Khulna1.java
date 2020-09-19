package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Khulna1 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna1);


        one =(PDFView)findViewById(R.id.Rabindranath);
        one.fromAsset("\n" +
                "Rabindranath Tagore.pdf").load();
    }
}
