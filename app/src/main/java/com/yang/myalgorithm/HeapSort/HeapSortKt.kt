package com.yang.myalgorithm.HeapSort

import android.util.Log
import java.util.*

/**
 * @author yangzc
 *	@data 2019/4/10 22:43
 *	@desc 堆排序
 *
 */
class HeapSortKt (private val array: IntArray) {


    /**
     * 堆排序的主要入口方法，共两步。
     */
    fun sort() {
        /*
         *  第一步：将数组堆化
         *  beginIndex = 第一个非叶子节点。
         *  从第一个非叶子节点开始即可。无需从最后一个叶子节点开始。
         *  叶子节点可以看作已符合堆要求的节点，根节点就是它自己且自己以下值为最大。
         */
        val len = array.size - 1
        val beginIndex = len - 1 shr 1
        for (i in beginIndex downTo 0)
            maxHeapify(i, len)
        /*
         * 第二步：对堆化数据排序
         * 每次都是移出最顶层的根节点A[0]，与最尾部节点位置调换，同时遍历长度 - 1。
         * 然后从新整理被换到根节点的末尾元素，使其符合堆的特性。
         * 直至未排序的堆长度为 0。
         */
        for (i in len downTo 1) {
            swap(0, i)
            maxHeapify(0, i - 1)
        }
    }

    private fun swap(i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }

    /**
     * 调整索引为 index 处的数据，使其符合堆的特性。
     *
     * @param index 需要堆化处理的数据的索引
     * @param len 未排序的堆（数组）的长度
     */
    private fun maxHeapify(index: Int, len: Int) {
        val li = (index shl 1) + 1 // 左子节点索引
        val ri = li + 1           // 右子节点索引
        var cMax = li             // 子节点值最大索引，默认左子节点。
        if (li > len) return       // 左子节点索引超出计算范围，直接返回。
        if (ri <= len && array[ri] > array[li])
        // 先判断左右子节点，哪个较大。
            cMax = ri
        if (array[cMax] > array[index]) {  //若“<”这是从大到小
            swap(cMax, index)      // 如果父节点被子节点调换，
            maxHeapify(cMax, len)  // 则需要继续判断换下后的父节点是否符合堆的特性。
        }
    }

    fun print(s: String, Tag: String): String {
        Log.d(Tag, Arrays.toString(array))
        return s + Arrays.toString(array)
    }
}