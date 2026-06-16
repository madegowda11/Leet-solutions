package com.Array.Package;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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
	public static int[] reversal1(int [] arr) {
		int i,j=0,n=arr.length;
		int [] res=new int[n];
		for(i=n-1;i>=0;i--) {
			res[j]=arr[i];
			j++;
		}
		return res;
	}
	public static int[] reversal2(int[] arr) {
		int i,n=arr.length;
		int [] res=new int[n];
		for(i=n-1;i>=0;i--) {
			res[n-i-1]=arr[i];
		}
		return res;
	}
	public static void reversal3(int[] arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static boolean isArrayPalindrome(int[] arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String [] args) {
		int [] arr=createIntArray();
		System.out.println("Original array: "+Arrays.toString(arr));
		int [] res=reversal1(arr);
		System.out.println("Reversed third memory array: "+Arrays.toString(res));
		res=reversal2(arr);
		System.out.println("Reversed third memory array: "+Arrays.toString(res));
		reversal3(arr);
		System.out.println("Reversed array in  place: "+Arrays.toString(arr));
		boolean flag=isArrayPalindrome(arr);
		if(flag) {
			System.out.println("Num is a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
}
