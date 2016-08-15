package com.example.admin.baitapnhom4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActualitesActivity extends AppCompatActivity {
    ImageView imgBackActualites,imgSearchActualites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualites);
        imgBackActualites = (ImageView) findViewById(R.id.imgBackActualites);
        imgSearchActualites = (ImageView) findViewById(R.id.imgSearchActualites);

        imgBackActualites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackActualites = new Intent(ActualitesActivity.this, MenuActivity.class);
                startActivity(intentBackActualites);
            }
        });
        imgSearchActualites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSearchActualites = new Intent(ActualitesActivity.this, SearchActivity.class);
                startActivity(intentSearchActualites);
            }
        });
    }
}
