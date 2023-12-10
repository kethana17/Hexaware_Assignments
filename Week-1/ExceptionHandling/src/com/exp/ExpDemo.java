package com.exp;

public class ExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Open file");
		
		System.out.println("Read data from file");
		
		try {
			
			int result = ExpDemo.div(4,2);
			System.out.println("Result" +result);
			String name=new String("Kethana");
			System.out.println(name.length());
			
		}
		
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Update data to file");
		
		System.out.println("Close file");
		
	}

	public static int div(int a, int b) throws ArithmeticException {
		
		return a/b;
		
	}

}
