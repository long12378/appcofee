package com.example.coffeeshoplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class profile extends AppCompatActivity {
    private CircleImageView rollback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
//        boolean finish = getIntent().getBooleanExtra("finish", false);
//
//        if (finish) {
//            startActivity(new Intent(profile.this, MainActivity.class));
//            finish();
//            return;
//        }
        rollback = (CircleImageView) findViewById(R.id.rollback4);
        rollback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this,optionMenu.class);
                startActivity(intent);
            }
        });
    }
}