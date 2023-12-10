package Inheritance;

public class Parent extends Object{
		int pid = 100;
		
public Parent() {
		
	    super();
			
		System.out.println("parent() is called obj created...");
}
		
		
	 void methodOne() {
			
			System.out.println("methodOne() from parent...");
			
		
		}

		@Override
		public String toString() {
			return "Parent [pid=" + pid + "]";
		}
		
		
		
}
