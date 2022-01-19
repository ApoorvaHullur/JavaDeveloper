package com.xworkz.execptions.block;

public class Arithmatic {
	public static void main(String[] args) {
		
		int num=200 ,div;
		try {
		div=num/0;
		
		System.out.println(div);
		}
		catch (ArithmeticException exception) {
			System.out.println(exception.getMessage());
			
		}
		
	}

}
