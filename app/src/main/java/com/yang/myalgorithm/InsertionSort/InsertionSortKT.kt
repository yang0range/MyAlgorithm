package com.yang.myalgorithm.InsertionSort

import android.util.Log
import java.util.*

/**
 * @author yangzc
 *	@data 2019/4/9 17:00
 *	@desc
 *
 */
class InsertionSortKT(private val array: IntArray) {

    //从小到大排序
    fun insertionSort() {
        for (i in 1 until array.size) {
            val key = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = key
        }

    }

    //从大到小排序
    fun insertionSort2() {
        for (i in 1 until array.size) {
            val key = array[i]
            var j = i - 1
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = key
        }
    }

    fun print(s: String, Tag: String): String {
        Log.d(Tag, Arrays.toString(array))
        return s + Arrays.toString(array)
    }

    companion object {

        //将arr[i] 插入到arr[0]...arr[i - 1]中
        fun insertion_sort(arr: IntArray) {
            for (i in 1 until arr.size) {
                val temp = arr[i]
                var j = i - 1
                //如果将赋值放到下一行的for循环内, 会导致在第10行出现j未声明的错误
                while (j >= 0 && arr[j] > temp) {
                    arr[j + 1] = arr[j]
                    j--
                }
                arr[j + 1] = temp
            }
        }
    }
}