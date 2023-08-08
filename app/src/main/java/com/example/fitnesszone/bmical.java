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


public class bmical extends AppCompatActivity {
String value;
float bmi;
EditText editText;
EditText editText1;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmical);
        button = findViewById(R.id.button1);
        editText=findViewById(R.id.editTextNumberDecimal);
        editText1=findViewById(R.id.editTextNumberDecimal2);
        editText.addTextChangedListener(textWatcher);
        editText1.addTextChangedListener(textWatcher);
        TextView textView=findViewById(R.id.textView4);
        TextView textView1=findViewById(R.id.textView5);
        Spinner spinner = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.bmi, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                value=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(editText.getText().toString())){
            Toast.makeText(bmical.this, "Fill The Values", Toast.LENGTH_SHORT).show();
        }
        else {
            String h=editText.getText().toString();
            String w=editText1.getText().toString();
            float height=Float.parseFloat(h);
            float weight=Float.parseFloat(w);
            if(value.equals("Metre")){
                bmi = weight / (height * height);
            }
            else if(value.equals("Cm")){
                bmi=weight*10000/(height*height);
            }
            textView.setText(""+bmi);

            if(bmi<18.5){
                textView1.setText("You Are UnderWeight");
            }
            else if(18.5<=bmi && bmi<25){
                textView1.setText("You Are Healthy");
            }
            else if(25<=bmi && bmi<40){
                textView1.setText("You Are OverWeight");
            }
            else if(bmi>=40){
                textView1.setText("You Are Obese");
            }
        }
    }
});
        Button button1=findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bmical.this,aboutbmi.class);
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

            button.setEnabled(!height.isEmpty() && !weight.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}