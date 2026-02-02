package com.ktdsuniversity.edu.generics.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("장민창1");
		names.add("장민창2");
		names.add("장민창3");
		names.add("장민창4");
		names.add("장민창5");
		
		System.out.println(names);
		String name = null;
		for(int i = 0; i < names.size(); i++) {
			name = names.get(i);
			System.out.println(name);
		}
		for(String name2 : names) {
			System.out.println();
		}
		
		int[] arr = new int[] {1,2,3};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int value : arr) {
			System.out.println(value);	
		}
		
		String[] names2 = new String[] {"A","B","C"};
		/**
		 * 1.A
		 * 2.B
		 * 3.C
		 */
		for(int i = 0; i < names2.length; i++) {
			System.out.println((i + 1) + ". " + names2[i]);
		}
		//list<Coffe> Coffe = new ArrayList<>();
	}

}
