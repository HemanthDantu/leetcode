package com.hemanth.Sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doBubbleSort(new int[]{16, 49, 3, 12, 56, 49, 55, 22, 13, 46, 19, 55, 46, 13, 25, 56, 9, 48, 45})));
    }

    private static int[] doBubbleSort(int[] arr) {
        for(int i=0; i< arr.length;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        return arr;
    }

}
