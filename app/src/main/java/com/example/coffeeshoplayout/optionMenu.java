package com.example.coffeeshoplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class optionMenu extends AppCompatActivity {
    ListView listViewshopee;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean_shopee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
        listViewshopee  = (ListView)findViewById(R.id.listviewCauthu);

        arr_bean_shopee = new ArrayList<ListViewBean>();
        arr_bean_shopee.add(new ListViewBean(R.drawable.house, "Coffee funky"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.login, "Profile"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.custom, "History"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.thanhtoan, "Payment"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.help, "Help"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.st, "Setting"));
        arr_bean_shopee.add(new ListViewBean(R.drawable.export, "Log Out"));
        adapter = new ListViewBaseAdapter(arr_bean_shopee, this);
        listViewshopee.setAdapter(adapter);
        listViewshopee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(optionMenu.this,mainMenu.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(optionMenu.this,profile.class);
                    startActivity(intent);
                }
                if(position == 6){
                    signOut();
                }
            }
        });
    }
    void signOut() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("finish", true);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                Intent.FLAG_ACTIVITY_NEW_TASK); // To clean up all activities
        startActivity(intent);
        finish();
    }
}