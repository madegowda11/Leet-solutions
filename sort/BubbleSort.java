package com.Array.Package;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static int[] createIntArr() {
		 int n,i;
		 Scanner sc=new Scanner(System.in);
			System.out.print("enter size:");
			n=sc.nextInt();
			int[] arr=new int[n];
			for(i=0;i<arr.length;i++) {
				System.out.print("enter val:");
				arr[i]=sc.nextInt();
			}
			return arr;
		}
	public static void swap(int[] arr,int left,int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	public static void bubbleSortAsc(int[] arr) {
		int i,j,n=arr.length;
		for(i=0;i<(n-1);i++) {
			for(j=0;j<((n-1)-i);j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,(j+1));
				}
			}
		}
	}
	public static void bubbleSortDsc(int[] arr) {
		int i,j,n=arr.length;
		for(i=0;i<(n-1);i++) {
			for(j=0;j<((n-1)-i);j++) {
				if(arr[j]<arr[j+1]) {
					swap(arr,j,(j+1));
				}
			}
		}
	}
	public static void main(String[]args) {
		int[] arr=createIntArr();
		System.out.println("original arrays:"+Arrays.toString(arr));
		bubbleSortAsc(arr);
		System.out.println("sorted ascending order:"+Arrays.toString(arr));
		bubbleSortDsc(arr);
		System.out.println("Dsc sorted array:"+Arrays.toString(arr));
	}
}

