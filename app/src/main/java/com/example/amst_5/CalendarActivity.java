package com.example.amst_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarActivity extends AppCompatActivity {

    private CalendarView mCalendar;
    private TextView task ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        mCalendar = (CalendarView)findViewById(R.id.calendario);
        task = (TextView)findViewById(R.id.taskDes);

        mCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                try {
                    Calendar c = Calendar.getInstance();
                    int d = c.get(Calendar.DAY_OF_MONTH);
                    int m = c.get(Calendar.MONTH);
                    int y = c.get(Calendar.YEAR);

                    String change = i + "/" + i1 + "/" + i2;
                    String actual = y + "/" + m + "/" + d;

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                    Date selected = sdf.parse(change);
                    Date today = sdf.parse(actual);

                    if(today.equals(selected)){
                        task.setText(change + "\n 13:00 Tienes Cita Medica hoy" );
                    }else{
                        task.setText(change + "\n No tienes tareas este dia.");
                    }

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}