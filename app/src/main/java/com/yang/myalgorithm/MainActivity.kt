package com.yang.myalgorithm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yang.myalgorithm.BinaryInsertSort.BinaryInsertSort
import com.yang.myalgorithm.BubbleSort.BubbleSort
import com.yang.myalgorithm.HeapSort.HeapSort
import com.yang.myalgorithm.InsertionSort.InsertionSort
import com.yang.myalgorithm.SelectSort.SelectSort
import com.yang.myalgorithm.ShellSort.ShellSort
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //冒泡排序
        val array = intArrayOf(5, 7, 4, 29, 11, 10)
        val bubbleSort = BubbleSort(array)
        bubbleSort.sort()
        bubbleSort.print("从小到大", "冒泡排序")
        tv_bubblesort.text = bubbleSort.print("从小到大", "冒泡排序")
        bubbleSort.sort2()
        bubbleSort.print("从大到小", "冒泡排序")
        tv_bubblesort.text = tv_bubblesort.text.toString() + "\n" + bubbleSort.print("从大到小", "冒泡排序")
        //选择排序
        val selectSort = SelectSort(array)
        selectSort.selectionSort()
        selectSort.print("从小到大", "选择排序")
        tv_selectsort.text = selectSort.print("从小到大", "选择排序")
        selectSort.selectionSort2()
        selectSort.print("从大到小", "选择排序")
        tv_selectsort.text = tv_selectsort.text.toString() + "\n" + selectSort.print("从大到小", "选择排序")
        //插入排序
        val insertionSort = InsertionSort(array)
        insertionSort.insertionSort()
        insertionSort.print("从小到大", "插入排序")
        tv_insertionsort.text = insertionSort.print("从小到大", "插入排序")
        insertionSort.insertionSort2()
        tv_insertionsort.text = tv_insertionsort.text.toString() + "\n" + insertionSort.print("从大到小", "插入排序")
        //二分插入排序
        val binaryInsertSort = BinaryInsertSort(array)
        binaryInsertSort.sort()
        binaryInsertSort.print("从小到大", "二分插入排序")
        tv_binaryinsertionsort.text = binaryInsertSort.print("从小到大", "二分插入排序")
        binaryInsertSort.sort2()
        binaryInsertSort.print("从大到小", "二分插入排序")
        tv_binaryinsertionsort.text =
            tv_binaryinsertionsort.text.toString() + "\n" + binaryInsertSort.print("从大到小", "二分插入排序")
        //希尔排序
        val shellsort = ShellSort(array)
        shellsort.sort()
        shellsort.print("从小到大", "希尔排序")
        tv_shellsort.text = shellsort.print("从小到大", "希尔排序")
        shellsort.sort2()
        shellsort.print("从大到小", "希尔排序")
        tv_shellsort.text =
            tv_shellsort.text.toString() + "\n" + shellsort.print("从大到小", "希尔排序")
        //堆排序
        val heapsort = HeapSort(array)
        heapsort.sort()
        heapsort.print("从小到大", "堆排序")
        tv_heapsort.text = heapsort.print("从小到大", "堆排序")


    }
}