package com.Array.Package;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	static Scanner sc=new Scanner(System.in);
	public static int[] createIntArray() {
		int n,i;
		System.out.println("Enter size: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++) {
			System.out.print("enter the val");
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	public static int binarySearchAsc(int[] arr, int target) {
		int start=0, end=arr.length-1,mid;
		while(start<=end) {
			mid=start+((end-start)/2);
			if(target == arr[mid]) {
				return mid;
			}
			//probability logic
			if(target < arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	
	public static int binarySearchDesc(int[] arr,int target) {
		int st=0,end=arr.length-1,mid;
		while(st<=end) {
			mid=st+((end-st)/2);
			if(target==arr[mid]) {
				return mid;
			}
			//probability logic
			if(target<arr[mid]) {
				st=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	public static int orderAgnosticBinarySearch(int[] arr,int target) {
		int  start=0,end=arr.length-1,mid;
		String flag="asc";
		if(arr[start]>arr[end]) {
			flag="desc";
		}
		while(start<=end) {
			mid=start+((end-start)/2);
			if(target==arr[mid]) {
				return mid;
			}
			if(flag.equals("asc")){
				//probability logic
				if(target < arr[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}else {
				//probability logic
				if(target<arr[mid]) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr=createIntArray();
		System.out.println("Enter the target element to be searched: ");
		int target=sc.nextInt();
		System.out.println("original array"+Arrays.toString(arr));
//		int index=binarySearchAsc(arr,target);
//		int index=binarySearchDesc(arr,target);
		int index=orderAgnosticBinarySearch(arr,target);
		if(index==-1) {
			System.out.println(target+" element is not found");
		}else {
			System.out.println(target+" element found at index "+index);
		}
	}

}
