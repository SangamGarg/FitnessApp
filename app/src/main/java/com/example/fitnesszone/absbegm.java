package com.example.fitnesszone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class absbegm extends AppCompatActivity {
Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absbegm);
        dialog=new Dialog(this);
    }
    public void showpop(View v ){
        TextView textView;
        dialog.setContentView(R.layout.absbegm1);
        textView =dialog.findViewById(R.id.textView7);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
    public void showpop1(View v ){
        TextView textView;
        dialog.setContentView(R.layout.absbegm2);
        textView =dialog.findViewById(R.id.textView7);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
    public void showpop2(View v ){
        TextView textView;
        dialog.setContentView(R.layout.absbegm3);
        textView =dialog.findViewById(R.id.textView7);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
    public void showpop3(View v ){
        TextView textView;
        dialog.setContentView(R.layout.absbegm4);
        textView =dialog.findViewById(R.id.textView7);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
    public void showpop4(View v ){
        TextView textView;
        dialog.setContentView(R.layout.absbegm5);
        textView =dialog.findViewById(R.id.textView7);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}