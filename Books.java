package com.xworkz.execptions.block;

public class Books {
	
	public Books() {
		System.out.println("books are main source of knowledge");
		{
			System.out.println("instance block inside the constructor ");
		}
	
	}
	
	static {
		System.out.println("envoking the static block");
		
	
		{
			System.out.println("instance block inside static");
		}
	}
	
	{
		
		System.out.println("envoking the instance block");
	}
	{
		System.out.println("inside the instance ");
	}

}
