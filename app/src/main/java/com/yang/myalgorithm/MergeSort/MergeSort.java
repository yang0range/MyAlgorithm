package com.yang.myalgorithm.MergeSort;

import android.util.Log;

import java.util.Arrays;

/**
 * @author yangzc
 * @data 2019/4/11 18:22
 * @desc 归并排序
 */
public class MergeSort {

    private int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    public  void mergesort() {
        int[] orderedArr = new int[array.length];
        for (int i = 2; i < array.length * 2; i *= 2) {
            for (int j = 0; j < (array.length + i - 1) / i; j++) {
                int left = i * j;
                int mid = left + i / 2 >= array.length ? (array.length - 1) : (left + i / 2);
                int right = i * (j + 1) - 1 >= array.length ? (array.length - 1) : (i * (j + 1) - 1);
                int start = left, l = left, m = mid;
                while (l < mid && m <= right) {
                    if (array[l] < array[m]) {
                        orderedArr[start++] = array[l++];
                    } else {
                        orderedArr[start++] = array[m++];
                    }
                }
                while (l < mid)
                    orderedArr[start++] = array[l++];
                while (m <= right)
                    orderedArr[start++] = array[m++];
            }
        }
    }


    public String print(String s, String Tag) {
        Log.d(Tag, Arrays.toString(array));
        return s + Arrays.toString(array);
    }

//    for (int j = 0; j < array.Length; j++)
//                       {
//              int temp;
//               for (int i = j; i > 0; i--)
//                {
//                   temp = array[i];
//                   array[i] = array[i - 1];
//                   array[i - 1] = temp;
//               }


}
