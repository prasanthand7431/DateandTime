package com.example.prasanth.myappdateandtime;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
    }

    public void sat(View view) {

        datePickerDialog=new DatePickerDialog(MainActivity.this,onDateSetListener,2000,6,23);
        datePickerDialog.show();

    }

    DatePickerDialog.OnDateSetListener onDateSetListener=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            String a=""+year+"/"+month+"/"+dayOfMonth;
            Toast.makeText(MainActivity.this, dayOfMonth+"/"+month+"/"+year, Toast.LENGTH_SHORT).show();
            textView.setText(a);
        }
    };

    public void tens(View view) {

        timePickerDialog = new TimePickerDialog(MainActivity.this,onTimeSetListener,02,10,true);
        timePickerDialog.show();

    }

    TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener(){

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            String a=""+hourOfDay+":"+minute;
            Toast.makeText(MainActivity.this, hourOfDay+":"+minute, Toast.LENGTH_SHORT).show();
            textView.setText(a);

        }


    };
}
