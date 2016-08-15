package com.example.admin.baitapnhom4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.admin.baitapnhom4.com.example.admin.Menbres.MenbresActivity;

public class MenuActivity extends AppCompatActivity {
    TextView tvMembres,etSearch,tvActulites,tvAvantages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvMembres = (TextView) findViewById(R.id.tvMembres);
        etSearch = (TextView) findViewById(R.id.etSearch);
        tvActulites = (TextView) findViewById(R.id.tvActulites);
        tvAvantages = (TextView) findViewById(R.id.tvAvantages);

        tvMembres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMembres = new Intent(MenuActivity.this, MenbresActivity.class);
                startActivity(intentMembres);
                //finish();
            }
        });

        etSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSearch = new Intent(MenuActivity.this, SearchActivity.class);
                startActivity(intentSearch);
            }
        });

        tvActulites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActulites = new Intent(MenuActivity.this, ActualitesActivity.class);
                startActivity(intentActulites);
            }
        });
        tvAvantages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAvantages = new Intent(MenuActivity.this, AvantagesActivity.class);
                startActivity(intentAvantages);
            }
        });

    }
}
