package com.example.mizuno.prog_graph;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import org.afree.chart.AFreeChart;
import org.afree.chart.ChartFactory;
import org.afree.data.general.DefaultPieDataset;

public class CircleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("朝食", new Integer(390));
        dataset.setValue("昼食", new Integer(500));
        dataset.setValue("夕食", new Integer(900));
        dataset.setValue("間食", new Integer(250));
        dataset.setValue("飲料", new Integer(240));

        //AFreeChartの作成
        AFreeChart chart = ChartFactory.createPieChart(
                "自分の名前",        //グラフのタイトル
                dataset,                //グラフにするデータ
                true,
                false,
                false);

        ChartView charview = (ChartView) findViewById(R.id.chart_view);
        charview.setChart(chart);
    }

}
