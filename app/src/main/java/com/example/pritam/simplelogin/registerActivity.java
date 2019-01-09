package com.example.pritam.simplelogin;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.time.Year;
import java.util.Calendar;

public class registerActivity extends AppCompatActivity {

    Button registerbtnjava;

    TextView mTv;
    Button mBtn;

    Calendar c;
    DatePickerDialog dpd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerbtnjava=(Button)findViewById(R.id.registerfinalbtn);
        mTv = (TextView)findViewById(R.id.etdate);
        mBtn = findViewById(R.id.btndate);

        registerbtnjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(registerActivity.this,welcomeActivity.class);
                startActivity(intent);

            }
        });

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c=Calendar.getInstance();
                int day=c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year=c.get(Calendar.YEAR);

                dpd=new DatePickerDialog(registerActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        mTv.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },day,month,year);

                dpd.show();

            }
        });

    }
}
