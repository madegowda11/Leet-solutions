package com.dcl.string;

import java.util.Scanner;

public class SumDigits {
	public static String sumDigits(String s) {
		String nstr="";
		int sumNum=0,i;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i) >= '0' && s.charAt(i)<='9') {
				sumNum=sumNum+((int)(s.charAt(i))-48);
			}else {
				nstr=nstr+s.charAt(i);
			}
		}
		return (nstr + Integer.toString(sumNum));
		
	}
	
	public static void main(String[] args) {
		String s,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s=sc.nextLine();
		System.out.println("Original String: "+s);
		res=sumDigits(s);
		System.out.println("Sum of digits in string is: "+res);
	}

}
