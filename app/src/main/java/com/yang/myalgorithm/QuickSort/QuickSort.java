package com.yang.myalgorithm.QuickSort;

import android.util.Log;

import java.util.Arrays;

/**
 * @author yangzc
 * @data 2019/4/11 18:57
 * @desc 快速排序
 */
public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }


    public  void sort(int head, int tail) {
        if (head >= tail || array == null || array.length <= 1) {
            return;
        }
        int i = head, j = tail, pivot = array[(head + tail) / 2]; // 用子表的第一个记录做基准
        while (i <= j) {// 从表的两端交替向中间扫描
            while (array[i] < pivot) {
                ++i;
            }
            while (array[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        sort(head, j); // 对低子表进行递归排序
        sort(i, tail); // 对高子表进行递归排序
    }

    public String print(String s, String Tag) {
        Log.d(Tag, Arrays.toString(array));
        return s + Arrays.toString(array);
    }
}
