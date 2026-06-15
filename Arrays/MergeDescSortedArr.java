package com.Array.Package;
//leetcode 88. Merge Sorted Array
import java.util.Arrays;

public class MergeDescSortedArr {

	public static int[] mergeDescSortArr(int[] arr1, int[] arr2) {
		int n1 = arr1.length, n2 = arr2.length;
		int i = 0, j = 0;
		int[] res = new int[n1 + n2];

		for (int k = 0; k < res.length; k++) {
			if (i < n1 && j < n2) {
				if (arr1[i] > arr2[j]) {
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
		int[] arr1 = { 100, 45, 32, 30, 15 };
		int[] arr2 = { 85, 64, 32, 15, 1, -5, -15 };
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
		int[] res = mergeDescSortArr(arr1, arr2);
		System.out.println("Desc sorted array : " + Arrays.toString(res));
	}

}
