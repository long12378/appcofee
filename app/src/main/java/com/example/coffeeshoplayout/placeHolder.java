package com.example.coffeeshoplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class placeHolder extends AppCompatActivity {
    private ImageView rollback;
    private Button rollbackmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_holder);
        rollback = (ImageView) findViewById(R.id.rollback3);
        rollback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(placeHolder.this,customMenu.class);
                startActivity(intent);
            }
        });
        rollbackmain = (Button) findViewById(R.id.backtomain);
        rollbackmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(placeHolder.this,mainMenu.class);
                startActivity(intent);
            }
        });
    }
}