package com.Array.Package;
import java.util.*;

public class SelectionSort {
	public static int[] createIntArray() {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++) {
			System.out.print("Enter val:");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void swap(int[] arr,int left,int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	
	public static void selectionSortAsc(int[] arr) {
		int i,j,currMaxEle,currMaxInd,actualInd,n=arr.length;
		for(i=0;i<(n-1);i++) {//cycles
			actualInd=((n-1)-i);
			//find the largest ele's curr index
			currMaxEle=Integer.MIN_VALUE;
			currMaxInd=-1;
			for(j=0;j<n-i;j++) {
				if(arr[j]>currMaxEle) {
					currMaxEle=arr[j];
					currMaxInd=j;
				}
			}
			swap(arr,actualInd,currMaxInd);
			
		}
	}
	
	public static void selectionSortDesc(int[] arr) {
		int i,j,currMinEle,currMinInd,actualInd,n=arr.length;
		for(i=0;i<(n-1);i++) {//cycles
			actualInd=((n-1)-i);
			//find the largest ele's curr index
			currMinEle=Integer.MAX_VALUE;
			currMinInd=-1;
			for(j=0;j<n-i;j++) {
				if(arr[j]<currMinEle) {
					currMinEle=arr[j];
					currMinInd=j;
				}
			}
			swap(arr,actualInd,currMinInd);
			
		}
	}


	public static void main(String[] args) {
		int[] arr=createIntArray();
		System.out.println("original array: "+Arrays.toString(arr));
		selectionSortAsc(arr);
		System.out.println("Asc Sorted array: "+Arrays.toString(arr));
		selectionSortDesc(arr);
		System.out.println("Dsc Sorted array: "+Arrays.toString(arr));

	}

}

