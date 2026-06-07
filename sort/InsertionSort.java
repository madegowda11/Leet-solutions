package com.Array.Package;

import java.util.Arrays;

import java.util.Scanner;

public class InsertionSort {
	public static int[] createIntArray() {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++) {
			System.out.print("Enter the value: ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void swap(int [] arr,int left,int right) {//index
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	public static void insertionSortAsc(int[] arr) {
		int n=arr.length,i,j;
		for(i=0;i<n-1;i++) {
			for(j=(i+1);j>0;j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,(j-1),j);
				}
			}
		}
	}
	public static void insertionSortDsc(int [] arr) {
		int i,j,n=arr.length;
		for(i=0;i<n-1;i++) {
			for(j=(i+1);j>0;j--) {
				if(arr[j-1]<arr[j]) {
					swap(arr,(j-1),j);
				}
			}
		}
	}
	public static void main(String args[]) {
		int arr[];
		arr=createIntArray();
		System.out.println("original array is: "+Arrays.toString(arr));
		insertionSortAsc(arr);
		System.out.println("Ascending sort array: "+Arrays.toString(arr));
		insertionSortDsc(arr);
		System.out.println("Dsc sort array: "+Arrays.toString(arr));
		}
}
