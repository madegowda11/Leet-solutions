package com.Array.Package;

import java.util.Arrays;

public class MergeAscSortedArr {

    public static int[] mergeAscSortedArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k,n1 = arr1.length, n2 = arr2.length;
        int[] res = new int[n1 + n2];
        for (k = 0; k < res.length; k++) {
            if (i < n1 && j < n2) {
                if (arr1[i] < arr2[j]) {
                    res[k] = arr1[i];
                    i++;
                } else {
                    res[k] = arr2[j];
                    j++;
                }
            } else if (i < n1) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {-3, 2, 10, 15};
        int[] arr2 = {1, 2, 2, 18, 25, 32};
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
        int[] res = mergeAscSortedArray(arr1, arr2);
        System.out.println("Asc sorted array : " + Arrays.toString(res));
    }
}
