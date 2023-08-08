package com.example.fitnesszone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class int_m extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_m);
        ImageButton imageButton=findViewById(R.id.imageButton4);
        ImageButton imageButton1=findViewById(R.id.imageButton5);
        ImageButton imageButton2=findViewById(R.id.imageButton6);
        ImageButton imageButton3=findViewById(R.id.imageButton7);
        ImageButton imageButton4=findViewById(R.id.imageButton8);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(int_m.this,absintm.class);
                startActivity(intent);
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(int_m.this,chestintm.class);
                startActivity(intent);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(int_m.this,armsintm.class);
                startActivity(intent);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(int_m.this,legsintm.class);
                startActivity(intent);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(int_m.this,sbintm.class);
                startActivity(intent);
            }
        });
    }
}