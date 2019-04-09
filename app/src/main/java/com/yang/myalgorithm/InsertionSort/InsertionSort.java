package com.yang.myalgorithm.InsertionSort;

import android.util.Log;

import java.util.Arrays;

/**
 * @author yangzc
 * @data 2019/4/9 16:46
 * @desc
 */
public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

    }


    public void insertionSort2() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

    }

    //将arr[i] 插入到arr[0]...arr[i - 1]中
    public static void insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            //如果将赋值放到下一行的for循环内, 会导致在第10行出现j未声明的错误
            for (; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    public String print(String s, String Tag) {
        Log.d(Tag, Arrays.toString(array));
        return s + Arrays.toString(array);
    }
}
