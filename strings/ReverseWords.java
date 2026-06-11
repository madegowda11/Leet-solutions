package com.dcl.string;

import java.util.Scanner;

//. to reverse each individual word without reversing the position of the word
public class ReverseWords {
	public static String reverseWord(String s) {
		s=s+" ";
		int i;
		String nword="",nsen="";
		for(i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				nword=s.charAt(i)+nword;
			}else if(nword !="") {
				if(nsen=="") {
					nsen=nsen+nword;
				}else {
					nsen=nsen+' '+nword;
				}
				nword="";
			}
		}
		return nsen;
	}
	
	//to reverse the position of the word without reversing each individual word
	
	public static String reversePosition(String s) {
		s=s+" ";
		int i;
		String nword="",nsen="";
		for(i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				nword=nword+s.charAt(i);
			}else if(nword !="") {
				if(nsen=="") {
					nsen=nword+nsen;
				}else {
					nsen=nword+' '+nsen;
				}
				nword="";
			}
		}
		return nsen;
	}

	public static void main(String[] args) {
		String s,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s=sc.nextLine();
		System.out.println("original string"+s);
		res=reverseWord(s);
		System.out.println("reversed word string is: "+res);
		res=reversePosition(s);
		System.out.println("reverse word position: "+res);
	}

}
