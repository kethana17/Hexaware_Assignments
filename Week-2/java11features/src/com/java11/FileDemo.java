package com.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("ABC text");
	
		String data = Files.readString(path);
		
		Path path2 = Paths.get("Output.txt");
		
		
		
		System.out.println(data);
	
	
	
	}

}
