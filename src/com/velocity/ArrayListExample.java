package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		
		List<String> list =new ArrayList<String>();
		list.add("Rupali");
		list.add("Tushar");
		list.add("Kavita");
		list.add("Abhishek");
		System.out.println(list);
		for(String s:list) {
			
			System.out.println(s);
		}
	}

}
