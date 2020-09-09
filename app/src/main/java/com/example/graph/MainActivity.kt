package com.example.graph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjoe64.graphview.series.BarGraphSeries
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet = GlobalModel.dataSet
        val datapoints = Array(dataSet.size) {dataSet[it]}
        graph.addSeries(BarGraphSeries<DataPoint>(datapoints))
        graph.viewport.isXAxisBoundsManual = true
        graph.viewport.setMinX(dataSet[1].x)
        graph.viewport.setMaxX(dataSet[6].x)
        graph.viewport.isScalable = true
        graph.viewport.isScrollable = true
    }
}