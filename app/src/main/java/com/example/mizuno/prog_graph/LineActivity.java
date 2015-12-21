package com.example.mizuno.prog_graph;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import org.afree.chart.AFreeChart;
import org.afree.chart.ChartFactory;
import org.afree.chart.plot.PlotOrientation;
import org.afree.data.category.DefaultCategoryDataset;

public class LineActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);

        // グラフデータを設定する
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(145100, "NTTドコモ", "7月");
        dataset.addValue(51800, "au", "7月");
        dataset.addValue(279500, "ソフトバンク", "7月");
        dataset.addValue(125500, "NTTドコモ", "8月");
        dataset.addValue(56600, "au", "8月");
        dataset.addValue(288900, "ソフトバンク", "8月");
        dataset.addValue(109400, "NTTドコモ", "9月");
        dataset.addValue(914000, "au", "9月");
        dataset.addValue(332600, "ソフトバンク", "9月");
        dataset.addValue(57700, "NTTドコモ", "10月");
        dataset.addValue(58400, "au", "10月");
        dataset.addValue(324200, "ソフトバンク", "10月");
        dataset.addValue(88100, "NTTドコモ", "11月");
        dataset.addValue(82300, "au", "11月");
        dataset.addValue(276600, "ソフトバンク", "11月");

        // グラフを生成する
        AFreeChart chart = ChartFactory.createLineChart("自分の名前", "キャリア", "契約数", dataset, PlotOrientation.VERTICAL, true, false, false);

        ChartView charview2 = (ChartView) findViewById(R.id.chart_view2);
        charview2.setChart(chart);

    }

}
