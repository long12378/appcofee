package com.example.coffeeshoplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class mainMenu extends AppCompatActivity {
    private ImageView orderbtn;
    private ImageView option;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        orderbtn = (ImageView) findViewById(R.id.orderbtn);
       orderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent intent = new Intent(mainMenu.this,menuApp.class);
                startActivity(intent);
           }
        });
       option = (ImageView) findViewById(R.id.option);
       option.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(mainMenu.this,optionMenu.class);
               startActivity(intent);
           }
       });
    }
}