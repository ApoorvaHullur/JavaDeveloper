package com.xworkz.exceptionBlock;

import java.io.FileNotFoundException;

public class ThrowException {
	
		static int number1=0;
		static int number2=10;
		
		static void Check() {
			if(number1==0||number2==0) {
				throw new ArithmeticException("value cannot be 0");
			}
				else
					System.out.println("number1*number2");
				}
				static void validatePath() throws FileNotFoundException{
					String path=null;
					if(path==null) {
						throw new FileNotFoundException("invalid path");
					}else {
							System.out.println("path is valid");
							}
						}
					
				
				public static void main(String args[]) {
					try {
						Check();
						
					}
					catch(ArithmeticException e) {
				}
		
	}
}


