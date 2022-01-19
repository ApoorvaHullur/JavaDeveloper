package com.xworkz.execptions.block;

public class Overflow {
	
	public Overflow() {
		try {
		new Overflow();
		}
		catch ( StackOverflowError execption) {
			System.out.println(execption.getMessage());
		}
		
	}
	
	public Overflow(String name) {
		this();
		
		
	}

 
	public static void main(String[] args) {
		Overflow overflow = new Overflow("Apoorva");
		
	}
	
	
}

