package com.dcl.string;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseStrDecre(String s) {
		String nstr="";
		for(int i=s.length()-1;i>=0;i--) {
			nstr=nstr+s.charAt(i);
		}
		return nstr;
	}
	
	//recursion logic
	public static String reverseStrDecRecurr(String s,String nstr,int i) {
		if(i<0) {
			return nstr;
		}
		nstr=nstr+s.charAt(i);
		return reverseStrDecRecurr(s,nstr,(i-1));
	}
	
	public static String reverseStrIncre(String s) {
		String nstr="";
		for(int i=0;i<s.length();i++) {
			nstr=s.charAt(i)+nstr;
		}
		return nstr;
	}
	
	public static String reverseStrIncreRecurr(String s,String nstr,int i) {
		if(i>s.length()-1) {   //if(i==s.length())
			return nstr;
		}
		nstr=s.charAt(i)+nstr;
		return reverseStrIncreRecurr(s,nstr,(i+1));
	}
	
	public static String strRevArray(String s) {
		char[] arr=s.toCharArray();
		int i=0,j=arr.length-1;
		while(i<j) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		String s,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s=sc.nextLine();
		System.out.println("Original String: " + s);
		res = reverseStrDecre(s);
		System.out.println("reversed string using decrement loop: " + res);
		res=reverseStrDecRecurr(s,"",(s.length()-1));
		System.out.println("reversed string using decrement recurr: " + res);
		res=reverseStrIncre(s);
		System.out.println("reversed string using increment loop: "+res);
		res=reverseStrIncreRecurr(s,"",0);
		System.out.println("reversed string using increment recurr:"+res);
		res=strRevArray(s);
		System.out.println("reverse string using array: "+res);
	}

}
