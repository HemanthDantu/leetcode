package com.hemanth.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doInsertionSortAgain(new int[]{16, 49, 3, 12, 56, 49, 55, 22, 13, 46, 19, 55, 46, 13, 25, 56, 9, 48, 45})));
        System.out.println(Arrays.toString(doInsertionSortAgain(new int[]{5,3,9,8,1})));

    }

    private static int[] doInsertionSort(int[] arr) {
        for(int i=1; i< arr.length; i++){
                  int temp = arr[i];
                  int j = i-1;
                  while(j>=0 && arr[j]>temp){
                      arr[j+1] = arr[j];
                      j--;
                  }
                  arr[j+1] = temp;
        }
        return arr;
    }

    public static int[] doInsertionSortAgain(int[] arr){

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;

    }

}
