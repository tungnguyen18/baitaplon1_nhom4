package com.example.admin.baitapnhom4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity  {
    Button btnLogin;
    EditText editUser,editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUser = (EditText)findViewById(R.id.editUser);
        editPass = (EditText)findViewById(R.id.editPass);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editUser.getText().toString().isEmpty() || editPass.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please insert use and password",Toast.LENGTH_SHORT).show();
                }else {
                    Intent intentMenu = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intentMenu);
                    finish();
                }

            }
        });
    }
}
