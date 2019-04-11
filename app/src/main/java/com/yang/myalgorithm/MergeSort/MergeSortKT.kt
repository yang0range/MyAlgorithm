package com.yang.myalgorithm.MergeSort

import android.util.Log
import java.util.*

/**
 * @author yangzc
 *	@data 2019/4/11 18:20
 *	@desc 归并排序
 *
 */
class MergeSortKT (private val array: IntArray) {


    fun mergesort() {
        val orderedArr = IntArray(array.size)
        var i = 2
        while (i < array.size * 2) {
            for (j in 0 until (array.size + i - 1) / i) {
                val left = i * j
                val mid = if (left + i / 2 >= array.size) array.size - 1 else left + i / 2
                val right = if (i * (j + 1) - 1 >= array.size) array.size - 1 else i * (j + 1) - 1
                var start = left
                var l = left
                var m = mid
                while (l < mid && m <= right) {
                    if (array[l] < array[m]) {
                        orderedArr[start++] = array[l++]
                    } else {
                        orderedArr[start++] = array[m++]
                    }
                }
                while (l < mid)
                    orderedArr[start++] = array[l++]
                while (m <= right)
                    orderedArr[start++] = array[m++]
            }
            i *= 2
        }
    }

    fun print(s: String, Tag: String): String {
        Log.d(Tag, Arrays.toString(array))
        return s + Arrays.toString(array)
    }
}