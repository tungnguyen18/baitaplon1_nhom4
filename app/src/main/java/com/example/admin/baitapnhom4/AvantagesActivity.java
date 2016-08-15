package com.example.admin.baitapnhom4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AvantagesActivity extends AppCompatActivity {
    ImageView imgSearchAvantages,imgBackAvantages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avantages);

        imgSearchAvantages = (ImageView) findViewById(R.id.imgSearchAvantages);
        imgBackAvantages = (ImageView) findViewById(R.id.imgBackAvantages);

        imgBackAvantages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackAvantages = new Intent(AvantagesActivity.this, MenuActivity.class);
                startActivity(intentBackAvantages);
            }
        });
        imgSearchAvantages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSearchAvantages = new Intent(AvantagesActivity.this, SearchActivity.class);
                startActivity(intentSearchAvantages);
            }
        });
       // onSetCustomizeMenuBar();
    }
   /*
    private void onSetCustomizeMenuBar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Không hiện tiêu đề
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //Hiện nút back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LayoutInflater mInflater = LayoutInflater.from(this);
        View mCustomView = mInflater.inflate(R.layout.customize_menu, null);
        TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.txtTitle);
        mTitleTextView.setText("Avantages");
        getSupportActionBar().setCustomView(mCustomView);
        getSupportActionBar().setDisplayShowCustomEnabled(true);



       /*
        LayoutInflater mInflater = LayoutInflater.from(this);

        View mCustomView = mInflater.inflate(R.layout.customize_menu, null);
        TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.txtTitle);

        ImageButton imgLeft = (ImageButton) mCustomView.findViewById(R.id.imgLeft);
        ImageButton imgRight = (ImageButton) mCustomView.findViewById(R.id.imgRight);

        mTitleTextView.setText("Avantages");
        imgLeft.setImageResource(R.drawable.header_menu);
        imgRight.setImageResource(R.drawable.header_search);

        getSupportActionBar().setCustomView(mCustomView);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        */
}
