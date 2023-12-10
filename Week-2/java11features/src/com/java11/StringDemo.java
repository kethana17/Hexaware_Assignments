package com.java11;

import java.util.stream.Stream;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello World Welcome to java");
		
		String str1 = new String(" Hello World ");
		
		Stream<String> stream = str1.lines();
		
		stream.filter((line)->{return !line.isBlank();})
				.map((line)->{return line.stripTrailing();})
				//.map(String::strip)
				.forEach(System.out::println);
		
	}

}
