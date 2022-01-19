package com.xworkz.execptions.block;

import java.io.BufferedReader;
import java.io.File;import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileNotFound {
	
	public static void main(String[] args)  {
		
		File file = new File("C:\\Users\\HP\\Desktop\\test.txt");
		//File file = new File("");
		
		BufferedReader br =null;
		try {
				br=new BufferedReader(new FileReader(file));
		}
     catch (FileNotFoundException exception) {
		  System.out.println(exception.getMessage());	
		}
		
		
		String st;
		try {
		while((st=br.readLine())!=null) {
		}
		
         System.out.println(st);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		}
			
	
	}
	
