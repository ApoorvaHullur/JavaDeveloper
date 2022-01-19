package com.xworkz.execptions.block;

public class ArrayOB {
	
	static int num[] = {7,8,4,9,9,7,5,3,8,5};
	public static void main(String[] args) {
		
		
		for (int i = 0; i <= num.length; i++) {
			try {
			System.out.println(num[i]);
			}
			catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println(exception.getMessage());
			}
		}
		
	}

}
