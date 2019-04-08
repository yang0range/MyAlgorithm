package com.yang.myalgorithm.SelectSort;

import android.util.Log;

import java.util.Arrays;

/**
 * @author yangzc
 * @data 2019/4/8 23:37
 * @desc 选择排序
 */
public class SelectSort {
    private int[] array;

    public SelectSort(int[] array) {
        this.array = array;
    }

    //从小到大
    public void selectionSort() {
        int min, temp;
        for (int i = 0; i < array.length; i++) {
            // 初始化未排序序列中最小数据数组下标
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                // 在未排序元素中继续寻找最小元素，并保存其下标
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            // 将未排序列中最小元素放到已排序列末尾
            if (min != i) {
                temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    //从大到小
    public void selectionSort2() {
        int max, temp;
        for (int i = 0; i < array.length; i++) {
            // 初始化未排序序列中最小数据数组下标
            max = i;
            for (int j = i + 1; j < array.length; j++) {
                // 在未排序元素中继续寻找最小元素，并保存其下标
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            // 将未排序列中最小元素放到已排序列末尾
            if (max != i) {
                temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }
        }
    }

    public String print(String s, String Tag) {
        Log.d(Tag, Arrays.toString(array));
        return s + Arrays.toString(array);
    }
}
