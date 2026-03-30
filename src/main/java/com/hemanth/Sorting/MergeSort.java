package com.hemanth.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{16, 49, 3, 12, 56, 49, 55, 22, 13, 46, 19, 55, 46, 13, 25, 56, 9, 48, 45};
        System.out.println(Arrays.toString(doMergeSort(arr, 0, arr.length-1)));
    }

    private static int[] doMergeSort(int[] arr, int l, int r) {
        if(l<r) {
            int mid = (l + r) / 2;
            doMergeSort(arr, l, mid);
            doMergeSort(arr, mid + 1, r);
            mergeArrayAgain(arr, l, mid, r);
        }
        return arr;
    }

    private static void mergeArray(int[] arr, int l, int mid, int r) {
    int sizeOfArr1 = mid-l+1;
    int sizeOfArr2 = r-mid;
    int[] arr1 = new int[sizeOfArr1];
    int[] arr2 = new int[sizeOfArr2];

        for(int i=0; i<sizeOfArr1;i++){
            arr1[i] = arr[l+i];
        }
        for(int i=0; i<sizeOfArr2;i++){
            arr2[i] = arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<sizeOfArr1 && j<sizeOfArr2){
            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<sizeOfArr1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<sizeOfArr2){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    private static void mergeArrayAgain(int[] arr, int l, int mid, int r) {

        int sizeOfArr1 = mid - l+1;
        int sizeOfArr2 = r-mid;

        int[] arr1 = new int[sizeOfArr1];
        int[] arr2 = new int[sizeOfArr2];


        for(int i=0;i<sizeOfArr1;i++){
            arr1[i] = arr[l+i];
        }
        for(int i=0;i<sizeOfArr2;i++){
            arr2[i] = arr[mid+i+1];
        }

        int i=0;
        int j=0;
        int k=l;

        while (i<sizeOfArr1 && j<sizeOfArr2){
            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<sizeOfArr1){
            arr[k] = arr1[i];
            i++;
            k++;
        }


        while(j<sizeOfArr2){
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }

    }
