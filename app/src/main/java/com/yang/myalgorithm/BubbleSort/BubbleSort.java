package com.yang.myalgorithm.BubbleSort;

import java.util.Arrays;

/**
 * @author yangzc
 * @data 2019/4/8 22:21
 * @desc 冒泡排序
 */
public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    /**
     * 从小到大
     */
    public void sort() {
        int length = array.length;
        if (length > 0) {
            for (int i = 1; i < length; i++) {
                for (int j = 0; j < length - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    /**
     * 从大到小
     */
    public void sort2() {
        int length = array.length;
        if (length > 0) {
            for (int i = length - 1; i > 0; i--) {
                for (int j = length - 1; j > length - 1 - i; j--) {
                    if (array[j] > array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        }
    }

    public String print(String s) {
        System.out.println(s + Arrays.toString(array));
        return s + Arrays.toString(array);
    }
}
