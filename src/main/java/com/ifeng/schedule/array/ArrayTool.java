package com.ifeng.schedule.array;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/2.
 */
public class ArrayTool {

    private ArrayTool() {
    }

    /**
     * 获取整形数组最大值。
     */
    public static int getMax(int[] arr) {
        int maxIndex = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > arr[maxIndex])
                maxIndex = x;
        }

        return arr[maxIndex];
    }

    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getIndex(int[] arr, int key) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == key)
                return x;
        }
        return -1;
    }

    public String arrayToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str = str + arr[i] + ",";
            } else {
                str = str + arr[i] + "]";
            }
        }
        return str;
    }
}
