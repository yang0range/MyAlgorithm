package com.yang.myalgorithm.ShellSort;

import android.util.Log;

import java.util.Arrays;

/**
 * @author yangzc
 * @data 2019/4/10 20:27
 * @desc 希尔排序
 */
public class ShellSort {
    private int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }


    public  void sort() {
        int number = array.length / 2;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] > temp) { //需要注意的是，这里array[j] > temp将会使数组从小到到排序。
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
    }

    public  void sort2() {
        int number = array.length / 2;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] < temp) { //需要注意的是，这里array[j] > temp将会使数组从大到小排序。
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
    }


    public String print(String s, String Tag) {
        Log.d(Tag, Arrays.toString(array));
        return s + Arrays.toString(array);
    }
}
