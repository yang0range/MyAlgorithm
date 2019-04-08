package com.yang.myalgorithm.BubbleSort

/**
 * @author yangzc
 *	@data 2019/4/8 22:22
 *	@desc
 *
 */
class BubbleSortKT(private val array: IntArray) {

    /**
     * 从小到大
     */
    fun sort() {
        val length = array.size
        if (length > 0) {
            for (i in 1 until length) {
                for (j in 0 until length - i) {
                    if (array[j] > array[j + 1]) {
                        val temp = array[j]
                        array[j] = array[j + 1]
                        array[j + 1] = temp
                    }
                }
            }
        }
    }

    /**
     * 从大到小
     */
    fun sort2() {
        val length = array.size
        if (length > 0) {
            for (i in length - 1 downTo 1) {
                for (j in length - 1 downTo length - 1 - i + 1) {
                    if (array[j] > array[j - 1]) {
                        val temp = array[j]
                        array[j] = array[j - 1]
                        array[j - 1] = temp
                    }
                }
            }
        }
    }

    fun print(s: String) {
        for (i in array.indices) {
            println(s + array[i])
        }
    }
}