package com.yang.myalgorithm.BinaryInsertSort;

import android.util.Log;

import java.util.Arrays;

/**
 * @author yangzc
 * @data 2019/4/10 0:09
 * @desc 二分插入排序
 */
public class BinaryInsertSort {
    private int[] array;

    public BinaryInsertSort(int[] array) {
        this.array = array;
    }

    public  void sort() {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int low = 0, high = i - 1;
            int mid = -1;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (array[mid] > temp) {
                    high = mid - 1;
                } else { // 元素相同时，也插入在后面的位置
                    low = mid + 1;
                }
            }
            for(int j = i - 1; j >= low; j--) {
                array[j + 1] = array[j];
            }
            array[low] = temp;
        }
    }

    public  void sort2() {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int low = 0, high = i - 1;
            int mid = -1;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (array[mid] < temp) {
                    high = mid - 1;
                } else { // 元素相同时，也插入在后面的位置
                    low = mid + 1;
                }
            }
            for(int j = i - 1; j >= low; j--) {
                array[j + 1] = array[j];
            }
            array[low] = temp;
        }
    }

    public String print(String s,String Tag) {
        Log.d(Tag, Arrays.toString(array));
        return s + Arrays.toString(array);
    }
}
