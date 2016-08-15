package com.example.admin.baitapnhom4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {
    ImageView imgBackSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        imgBackSearch = (ImageView) findViewById(R.id.imgBackSearch);

        imgBackSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSearchActualites = new Intent(SearchActivity.this, MenuActivity.class);
                startActivity(intentSearchActualites);
            }
        });
    }
}
