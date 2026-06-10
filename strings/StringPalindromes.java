package com.dcl.string;
import java.util.*;
public class StringPalindromes {
	
	public static String strFilter(String s) {
		String nstr="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) >='A' && s.charAt(i)<='Z') {
				nstr=nstr+(char)((int)s.charAt(i)+32);
			}else if((s.charAt(i) >= 'a' && s.charAt(i)<='z') || s.charAt(i) >= '0' && s.charAt(i) <= '9'){
				nstr=nstr+s.charAt(i);
			}
		}
		return nstr;
	}
	
	public static boolean isStrPalindrome(String s) {
		s=strFilter(s);
		int i=0,j=s.length()-1;
		while(i<j) {
			
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s;
		boolean flag;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		s=sc.nextLine();
		
		if(flag=isStrPalindrome(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
