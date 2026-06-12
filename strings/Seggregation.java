package com.dcl.string;

import java.util.*;
import java.util.Map.Entry;

public class Seggregation {
	
	public static List<Integer> findDuplicates(int[] arr){
		Map<Integer,Integer> hm=new HashMap();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], (hm.get(arr[i])+1));
			}else {
				hm.put(arr[i], 1);
			}
		}
		List<Integer>dup=new ArrayList();
		for(Entry<Integer,Integer>entry: hm.entrySet()) {
			if(entry.getValue()>1) {
				dup.add(entry.getKey());
			}
		}
		return dup;
	}
	public static List<Integer> findUnique(int[] arr){
		Map<Integer,Integer> hm=new HashMap();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], (hm.get(arr[i])+1));
			}else {
				hm.put(arr[i], 1);
			}
		}
		List<Integer> dup=new ArrayList();
		for(Entry<Integer,Integer> entry:hm.entrySet()) {
			if(entry.getValue()==1) {
				dup.add(entry.getKey());
			}
		}
		return dup;
	}
	
	public static List<Integer> findNonDuplicates(int[] arr){
		Map<Integer,Integer> hm=new HashMap();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], (hm.get(arr[i])+1));
			}else {
				hm.put(arr[i], 1);
			}
		}
		List<Integer> dup=new ArrayList();
		for(Entry<Integer,Integer> entry:hm.entrySet()) {
			if(entry.getValue()>=1) {
				dup.add(entry.getKey());
			}
		}
		return dup;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,6,8,56,8,56,8,56};
		List<Integer>res=findDuplicates(arr);
		System.out.println(res);
		List<Integer>ress=findUnique(arr);
		System.out.println(ress);
		List<Integer>result=findNonDuplicates(arr);
		System.out.println(result);
	}
}
