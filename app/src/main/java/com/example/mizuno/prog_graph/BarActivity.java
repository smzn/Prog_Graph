package com.example.mizuno.prog_graph;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import org.afree.chart.AFreeChart;
import org.afree.chart.ChartFactory;
import org.afree.chart.plot.PlotOrientation;
import org.afree.data.category.DefaultCategoryDataset;

public class BarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.addValue(800, "本社", "4月");
        data.addValue(600, "本社", "5月");
        data.addValue(900, "本社", "6月");

        AFreeChart chart =
                ChartFactory.createBarChart("自分の名前",
                        "月",
                        "売上",
                        data,
                        PlotOrientation.VERTICAL,
                        true,
                        false,
                        false);


        ChartView charview1 = (ChartView) findViewById(R.id.chart_view1);
        charview1.setChart(chart);

    }

}
