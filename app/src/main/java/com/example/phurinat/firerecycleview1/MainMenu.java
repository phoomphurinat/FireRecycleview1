package com.example.phurinat.firerecycleview1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button Insertfoodbutton = (Button)findViewById(R.id.Insertfoodbutton);
        Insertfoodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), FoodEnrollSearch.class);
                startActivity(startIntent);
            }

            });

        Button Inventorylistbutton = (Button)findViewById(R.id.Currentinventorybutton);
        Inventorylistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }

        });
        }


}


