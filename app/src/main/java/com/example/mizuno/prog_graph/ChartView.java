package com.example.mizuno.prog_graph;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import org.afree.chart.AFreeChart;
import org.afree.graphics.geom.RectShape;

/**
 * Created by mizuno on 2015/12/11.
 */
public class ChartView extends View {

    private AFreeChart chart;

    public ChartView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        RectShape chartArea = new RectShape(0.0, 0.0, 450.0, 450.0);
        this.chart.draw(canvas, chartArea);

    }

    public void setChart(AFreeChart chart) {
        this.chart = chart;
    }
}

