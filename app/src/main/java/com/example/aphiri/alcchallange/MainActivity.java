package com.example.aphiri.alcchallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        Button aboutalc;
        Button myprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutalc =  findViewById(R.id.aboutalc);
       aboutalc.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,AboutAlcActivity.class);
              view.getContext().startActivity(intent);
           }
       });
        myprofile = findViewById(R.id.myprofile);
       myprofile.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,MyProfileActivity.class);
              view.getContext().startActivity(intent);
            }
        });

    }
}
