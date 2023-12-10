package set;

import java.util.Set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Don");
		set1.add("Adam");
		set1.add("Ford");
		set1.add("Brown");
		
		System.out.println(set1);
		
		Set<Employee> set2 = new TreeSet<Employee>();
		
		set2.add(new Employee(103,"anand",3000));
		set2.add(new Employee(107,"rahul",2000));
		set2.add(new Employee(102,"akhil",5000));
		set2.add(new Employee(105,"deepak",7000));
		
		System.out.println(set2);
		
		
	}

}
