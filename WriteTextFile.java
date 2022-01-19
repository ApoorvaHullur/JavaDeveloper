package com.xworkz.writefile;

import java.io.FileWriter;

public class WriteTextFile {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("C://Users//HP//Desktop//test.txt");
		fw.write("Hellow world");
				fw.close();
		}
		catch(Exception e) {
			System.out.println("failed");
			
		}
		System.out.println("success");		
				
	}
}
