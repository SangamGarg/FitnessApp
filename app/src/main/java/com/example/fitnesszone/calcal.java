package com.example.fitnesszone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class calcal extends AppCompatActivity{
    String gender;
    double BMR;
    String activity;
    double calories;
    EditText editText1;
    EditText editText2;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcal);
        TextView textView=findViewById(R.id.textView);
         button = findViewById(R.id.button);
         editText = findViewById(R.id.editTextNumberDecimal);
         editText1 = findViewById(R.id.editTextNumberDecimal2);
         editText2 = findViewById(R.id.editTextNumberSigned);
        editText.addTextChangedListener(textWatcher);
        editText1.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Sex, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                gender=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Spinner spinner1 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.Activity, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                activity=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                //Toast.makeText(calcal.this, "Calculated", Toast.LENGTH_SHORT).show();
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast.makeText(calcal.this, "Fill The Values", Toast.LENGTH_SHORT).show();
                }
                else {
                    String h=editText.getText().toString();
                    String w=editText1.getText().toString();
                    String a=editText2.getText().toString();
                    int height=Integer.parseInt(h);
                    float weight=Float.parseFloat(w);
                    int age=Integer.parseInt(a);
                    if(gender.equals("Male")){
                        BMR =66.5 + (13.75 * weight) + (5.003 * height) - (6.75 * age);
                    }
                    else if (gender.equals("Female")){
                        BMR =655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
                    }
                    switch (activity) {
                        case "Sedentary(little or no exercise)":
                            calories = BMR * 1.2;
                            break;
                        case "Lightly Active(light exercise/sports 1–3 days/week)":
                            calories = BMR * 1.375;
                            break;
                        case "Moderately Active(moderate exercise/sports 3–5 days/week)":
                            calories = BMR * 1.55;
                            break;
                        case "Very Active(hard exercise/sports 6–7 days a week)":
                            calories = BMR * 1.725;
                            break;
                        case "Extra Active(very hard exercise/sports)":
                            calories = BMR * 1.9;
                            break;
                    }

                    int cal=(int) calories;
                    textView.setText(""+cal);
                }
            }
        });
        Button button1=findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(calcal.this,aboutcalorie.class);
                startActivity(intent);
            }
        });
    }
    private TextWatcher textWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String height = editText.getText().toString().trim();
            String weight = editText1.getText().toString().trim();
            String age = editText2.getText().toString().trim();

            button.setEnabled(!height.isEmpty() && !weight.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    }