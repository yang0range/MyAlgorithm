package com.yang.myalgorithm.ShellSort

import android.util.Log
import java.util.*

/**
 * @author yangzc
 *	@data 2019/4/10 22:00
 *	@desc 希尔排序
 *
 */
class ShellSortKT (private val array: IntArray) {


    fun sort() {
        var number = array.size / 2
        var i: Int
        var j: Int
        var temp: Int
        while (number >= 1) {
            i = number
            while (i < array.size) {
                temp = array[i]
                j = i - number
                while (j >= 0 && array[j] > temp) { //需要注意的是，这里array[j] > temp将会使数组从小到到排序。
                    array[j + number] = array[j]
                    j = j - number
                }
                array[j + number] = temp
                i++
            }
            number = number / 2
        }
    }

    fun sort2() {
        var number = array.size / 2
        var i: Int
        var j: Int
        var temp: Int
        while (number >= 1) {
            i = number
            while (i < array.size) {
                temp = array[i]
                j = i - number
                while (j >= 0 && array[j] < temp) { //需要注意的是，这里array[j] > temp将会使数组从大到小排序。
                    array[j + number] = array[j]
                    j = j - number
                }
                array[j + number] = temp
                i++
            }
            number = number / 2
        }
    }


    fun print(s: String, Tag: String): String {
        Log.d(Tag, Arrays.toString(array))
        return s + Arrays.toString(array)
    }
}