package com.example.admin.baitapnhom4.com.example.admin.Profil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.admin.baitapnhom4.R;
import com.example.admin.baitapnhom4.SearchActivity;
import com.example.admin.baitapnhom4.com.example.admin.Menbres.MenbresActivity;

public class Profil extends AppCompatActivity {
    ImageView imgSearchProfil,imgBackProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        imgBackProfil = (ImageView) findViewById(R.id.imgBackProfil);
        imgSearchProfil = (ImageView) findViewById(R.id.imgSearchProfil);

        imgBackProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackMenbres = new Intent(Profil.this, MenbresActivity.class);
                startActivity(intentBackMenbres);
            }
        });
        imgSearchProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSearchActualites = new Intent(Profil.this, SearchActivity.class);
                startActivity(intentSearchActualites);
            }
        });
        //ActionBar actionBar = getSupportActionBar();
        // actionBar.setBackgroundDrawable(null);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ProfilAdapter adapter = new ProfilAdapter(DummyData.getData());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);
    }
}
