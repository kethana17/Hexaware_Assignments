package constructors;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		String name = null;  //x,name,t are local variables
		TestEmployee t = null;
		
		System.out.println(x);
		System.out.println(name);
		
		Employee e1 = new Employee(101,"King",3000);
		System.out.println(e1.toString());
		
		System.out.println(e1.getEid()+" "+ e1.getEname() +" "+ e1.getSalary());
		Employee e2 = new Employee(102,"Tom",2000);
		Employee e = new Employee();
				e.setEname("Keerthi");
			System.out.println(e.getEname());
	}

}
