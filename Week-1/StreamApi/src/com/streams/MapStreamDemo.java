package com.streams;

import java.util.Arrays;
import java.util.List;

public class MapStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"smith","Adithya","vishal","jyothika","datta","Kethana"};
		
		List<String> list = Arrays.asList(names);
		
		list.stream().map((name)->{System.out.println(name); 
		return name.length();})
		.forEach((len)->{System.out.println(len);});
		
	}

}
