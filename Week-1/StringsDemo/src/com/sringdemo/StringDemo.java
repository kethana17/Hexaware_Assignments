package com.sringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="Kethana";
		
		String name3 ="Kethana";
		
		String name2 = new String("Kethana");
		
		String name4 = new String("Kethana");

		System.out.println("Compare values 1,3"+name1.equals(name3));
		System.out.println(name1 == name3);
		System.out.println(name1.hashCode());
		System.out.println(name3.hashCode());
		System.out.println("compare values 2,4"+name2.equals(name4));
		System.out.println(name2 == name4);
		String s1 = "A";
		String s2 = "B";
		
		System.out.println(s1.compareTo(s2));
		
		//A,B 65-66 = -1 already sorted
		System.out.println(s2.compareTo(s1));
		
		//B,A 66-65 =1 need to sort
		
		System.out.println(s1.compareTo(s2));
		//65-65=0 dont do anything
		
		String city1 = "HYDERABAD";
		String city2 = "hyderabad";
		
		System.out.println(city1.equalsIgnoreCase(city2));
		
		//string is immutable
		
		String name = "Kethana";
		name = name.concat("Allam");
		name = name + "Keerthi";
		
		//StringBuffer or StringBuilder
		
		StringBuffer sb = new StringBuffer("Hello");
			sb = sb.append("Friends");
			sb.append("Sir");
			System.out.println(sb);
			System.out.println(sb.reverse());
			//stringBuffer is thread safe or synchronize
			//StringBuilder is not thread safe or asynchronize
	}
	
	
	


}
