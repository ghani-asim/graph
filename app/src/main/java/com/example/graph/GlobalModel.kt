package com.example.graph

import com.jjoe64.graphview.series.DataPoint

object GlobalModel {

    val dataSet: MutableList<DataPoint> = java.util.ArrayList()

    init {
        dataSet.add(DataPoint(1.toDouble(), 2.toDouble()))
        dataSet.add(DataPoint(2.toDouble(), 5.toDouble()))
        dataSet.add(DataPoint(3.toDouble(), 3.toDouble()))
        dataSet.add(DataPoint(4.toDouble(), 1.toDouble()))
        dataSet.add(DataPoint(5.toDouble(), 2.toDouble()))
        dataSet.add(DataPoint(6.toDouble(), 7.toDouble()))
        dataSet.add(DataPoint(7.toDouble(), 9.toDouble()))
        dataSet.add(DataPoint(8.toDouble(), 4.toDouble()))
        dataSet.add(DataPoint(9.toDouble(), 5.toDouble()))
        dataSet.add(DataPoint(10.toDouble(), 9.toDouble()))
        dataSet.add(DataPoint(11.toDouble(), 7.toDouble()))
        dataSet.add(DataPoint(12.toDouble(), 0.toDouble()))
        dataSet.add(DataPoint(13.toDouble(), 3.toDouble()))
        dataSet.add(DataPoint(14.toDouble(), 4.toDouble()))
    }
}