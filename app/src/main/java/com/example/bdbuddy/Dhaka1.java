package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Dhaka1 extends AppCompatActivity  {
  private PDFView one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka1);
        one =(PDFView)findViewById(R.id.arial);
        one.fromAsset("Arial Beel.pdf").load();

    }


}
