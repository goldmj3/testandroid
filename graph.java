package com.example.goldm.testandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

import java.util.ArrayList;

public class graph extends AppCompatActivity {

    TextView textviewa, textviewb, textviewc, textviewd, textviewf, textviewnum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        textviewa = (TextView) findViewById(R.id.tv1);
        textviewb = (TextView) findViewById(R.id.tv2);
        textviewc = (TextView) findViewById(R.id.tv3);
        textviewd = (TextView) findViewById(R.id.tv4);
        textviewf = (TextView) findViewById(R.id.tv5);
        textviewnum = (TextView) findViewById(R.id.tv6);

        String num = getIntent().getStringExtra("num");
        double numdub = Integer.parseInt(num);

        String AA = getIntent().getStringExtra("A");
        double adouble = Integer.parseInt(AA);
        double aperct = (adouble / numdub) * (100);

        String BB = getIntent().getStringExtra("B");
        double bdouble = Integer.parseInt(BB);
        double bperct = (bdouble / numdub) * (100) ;

        String CC = getIntent().getStringExtra("C");
        double cdouble = Integer.parseInt(CC);
        double cperct = (cdouble / numdub) * (100);

        String DD = getIntent().getStringExtra("D");
        double ddouble = Integer.parseInt(DD);
        double dperct = (ddouble / numdub) * (100);

        String FF = getIntent().getStringExtra("F");
        double fdouble = Integer.parseInt(FF);
        double fperct = (fdouble / numdub) * (100);
        String fff = String.valueOf(fperct) + "f";
/*
        barChart = (BarChart) findViewById(R.id.bargraph);
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(4f,0));
        barEntries.add(new BarEntry(88f,1));
        barEntries.add(new BarEntry(66f,2));
        barEntries.add(new BarEntry(12f,3));
        barEntries.add(new BarEntry(19f,4));
        barEntries.add(new BarEntry(91f,5));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Dates");


        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("April");
        theDates.add("May");
        theDates.add("June");
        theDates.add("March");
        theDates.add("October");
        theDates.add("food");

        BarData theData = new BarData(theDates,barDataSet);
        barChart.setData(theData);
*/
        GraphView graph = (GraphView) findViewById(R.id.graph);
        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[] {
                new DataPoint(0, aperct),
                new DataPoint(1, bperct),
                new DataPoint(2, cperct),
                new DataPoint(3, dperct),
                new DataPoint(4, fperct)
        });
        graph.setTitle("Grades");
        graph.addSeries(series);




    }


}
