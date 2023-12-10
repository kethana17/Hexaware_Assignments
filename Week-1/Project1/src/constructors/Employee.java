package constructors;

public class Employee extends Object {   //POJO or entity or bean class
	
	private int eid; //Data hiding
	private String ename;
	private double salary;
	
	public Employee() {
		
		super();
	}

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public String getEname() {
		return ename;
	}
	
	
	
}
