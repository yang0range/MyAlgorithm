package com.yang.myalgorithm.QuickSort

import android.util.Log
import java.util.*

/**
 * @author yangzc
 * @data 2019/4/11 19:14
 * @desc  快速排序
 */
class QuickSortKT(private val array: IntArray?) {


    fun sort(head: Int, tail: Int) {
        if (head >= tail || array == null || array.size <= 1) {
            return
        }
        var i = head
        var j = tail
        val pivot = array[(head + tail) / 2] // 用子表的第一个记录做基准
        while (i <= j) {// 从表的两端交替向中间扫描
            while (array[i] < pivot) {
                ++i
            }
            while (array[j] > pivot) {
                --j
            }
            if (i < j) {
                val t = array[i]
                array[i] = array[j]
                array[j] = t
                ++i
                --j
            } else if (i == j) {
                ++i
            }
        }
        sort(head, j) // 对低子表进行递归排序
        sort(i, tail) // 对高子表进行递归排序
    }

    fun print(s: String, Tag: String): String {
        Log.d(Tag, Arrays.toString(array))
        return s + Arrays.toString(array)
    }
}
