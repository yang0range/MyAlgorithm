package com.yang.myalgorithm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yang.myalgorithm.BubbleSort.BubbleSort
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //冒泡排血
        val array = intArrayOf(5, 7, 4, 29, 11, 10)
        val bubbleSort = BubbleSort(array)
        bubbleSort.sort()
        bubbleSort.print("从小到大")
        bubbleSort.sort2()
        bubbleSort.print("从大到小")
        tv_bubblesort.text = bubbleSort.print("从小到大") + "\n" + bubbleSort.print("从大到小")
    }
}
