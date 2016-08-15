package com.example.admin.baitapnhom4.com.example.admin.Menbres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.admin.baitapnhom4.MenuActivity;
import com.example.admin.baitapnhom4.R;
import com.example.admin.baitapnhom4.SearchActivity;
import com.example.admin.baitapnhom4.com.example.admin.Profil.Profil;

import java.util.ArrayList;
import java.util.List;

public class MenbresActivity extends AppCompatActivity implements OnRecyclerViewItemClick {

    RecyclerView recyclerViewMembres;
    ImageView imgSearchMenbres,imgBackMenbres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menbres);

        imgBackMenbres = (ImageView) findViewById(R.id.imgBackMenbres);
        imgSearchMenbres = (ImageView) findViewById(R.id.imgSearchMenbres);

        imgBackMenbres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackMenbres = new Intent(MenbresActivity.this, MenuActivity.class);
                startActivity(intentBackMenbres);
            }
        });
        imgSearchMenbres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSearchActualites = new Intent(MenbresActivity.this, SearchActivity.class);
                startActivity(intentSearchActualites);
            }
        });

        recyclerViewMembres = (RecyclerView) findViewById(R.id.recyclerViewMembres);
        recyclerViewMembres.setLayoutManager(new LinearLayoutManager(this));


        List<Menbres> menbresList= new ArrayList<>();
        //List<SimpleItem> simpleItemList= new ArrayList<>();
        for(int i=0;i<20;i++){
            menbresList.add(new Menbres(null,"Antoine Riollet","Bienvenue sua moon profil"));
        }

        MenbresAdapter menbresAdapter = new MenbresAdapter(menbresList);
        menbresAdapter.setOnRecyclerViewItemClick(this);
        recyclerViewMembres.setAdapter(menbresAdapter);
    }

    @Override
    public void onItemClick(View view, int position) {

        Intent intentProfil = new Intent(MenbresActivity.this, Profil.class);
        startActivity(intentProfil);
       // Toast.makeText(getBaseContext(),"gfgfgfg",Toast.LENGTH_LONG).show();
    }
}
