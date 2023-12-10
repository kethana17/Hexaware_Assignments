package map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import set.Employee;
import set.MyComparator;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();

		map.put(33, "Ravi");
		map.put(23, "Smith");
		map.put(65, "Tom");
		map.put(38, "Adam");
		map.put(42, "Ravi");
		
		System.out.println(map);
		
		Set<Integer> keySet = map.keySet();
		
		for(Integer key:keySet) {
			
			System.out.println(key +" "+map.get(key));
		}
		
		Map<Employee,String> map2 = new TreeMap<Employee,String>(new MyComparator());
		
		map2.put(new Employee(103,"anand",3000),"Delhi");
		map2.put(new Employee(107,"rahul",2000),"Pune");
		map2.put(new Employee(102,"akhil",5000),"Punjab");
		map2.put(new Employee(105,"deepak",7000),"Chennai");
		map2.put(new Employee(109,"deepak",7000),"Mumbai");
		
		System.out.println(map2);
		
		
		
		
	}

}
