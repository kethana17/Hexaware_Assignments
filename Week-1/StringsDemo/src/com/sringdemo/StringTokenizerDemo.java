package com.sringdemo;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "Hello Friends How are you I am Fine Thank You";
		String arr[]= data.split(" ");
		for(String token : arr) {
			System.out.println(token);
		}
	}

}
