package com.yang.myalgorithm.SelectSort

import android.util.Log
import java.util.*

/**
 * @author yangzc
 *	@data 2019/4/8 23:46
 *	@desc 选择排序
 *
 */
class SelectSortKT(private val array: IntArray) {

    //从小到大
    fun selectionSort() {
        var min: Int
        var temp: Int
        for (i in array.indices) {
            // 初始化未排序序列中最小数据数组下标
            min = i
            for (j in i + 1 until array.size) {
                // 在未排序元素中继续寻找最小元素，并保存其下标
                if (array[j] < array[min]) {
                    min = j
                }
            }
            // 将未排序列中最小元素放到已排序列末尾
            if (min != i) {
                temp = array[min]
                array[min] = array[i]
                array[i] = temp
            }
        }
    }

    //从大到小
    fun selectionSort2() {
        var max: Int
        var temp: Int
        for (i in array.indices) {
            // 初始化未排序序列中最小数据数组下标
            max = i
            for (j in i + 1 until array.size) {
                // 在未排序元素中继续寻找最小元素，并保存其下标
                if (array[j] > array[max]) {
                    max = j
                }
            }
            // 将未排序列中最小元素放到已排序列末尾
            if (max != i) {
                temp = array[max]
                array[max] = array[i]
                array[i] = temp
            }
        }
    }

    fun print(s: String, Tag: String): String {
        Log.d(Tag, Arrays.toString(array))
        return s + Arrays.toString(array)
    }
}