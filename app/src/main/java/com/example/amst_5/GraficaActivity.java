package com.example.amst_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class GraficaActivity extends AppCompatActivity {

    LineChart mpLineChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafica);
        mpLineChart = (LineChart)findViewById(R.id.line_chart);
        LineDataSet lineDataSet1 = new LineDataSet(dataValues(),"Data Set 1");
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);

        LineData data =  new LineData(dataSets);
        mpLineChart.setData(data);
        mpLineChart.invalidate();

    }

    private ArrayList<Entry> dataValues(){
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry(0,5));
        dataVals.add(new Entry(5,10));
        dataVals.add(new Entry(10,15));
        dataVals.add(new Entry(15,20));
        dataVals.add(new Entry(20,25));
        return dataVals;
    }

}