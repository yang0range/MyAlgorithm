package com.yang.myalgorithm.BinaryInsertSort

import android.util.Log
import java.util.*

/**
 * @author yangzc
 *	@data 2019/4/10 0:27
 *	@desc 二分法插入排序
 *
 */
class BinaryInsertSortKT(private val array: IntArray) {
    //从小到大
    fun sort() {
        for (i in 1 until array.size) {
            val temp = array[i]
            var low = 0
            var high = i - 1
            var mid = -1
            while (low <= high) {
                mid = low + (high - low) / 2
                if (array[mid] > temp) {
                    high = mid - 1
                } else { // 元素相同时，也插入在后面的位置
                    low = mid + 1
                }
            }
            for (j in i - 1 downTo low) {
                array[j + 1] = array[j]
            }
            array[low] = temp
        }
    }

    //从大到小
    fun sort2() {
        for (i in 1 until array.size) {
            val temp = array[i]
            var low = 0
            var high = i - 1
            var mid = -1
            while (low <= high) {
                mid = low + (high - low) / 2
                if (array[mid] < temp) {
                    high = mid - 1
                } else { // 元素相同时，也插入在后面的位置
                    low = mid + 1
                }
            }
            for (j in i - 1 downTo low) {
                array[j + 1] = array[j]
            }
            array[low] = temp
        }
    }

    fun print(s: String, Tag: String): String {
        Log.d(Tag, Arrays.toString(array))
        return s + Arrays.toString(array)
    }
}