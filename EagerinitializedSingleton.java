package com.xworkz.singleton2;

public class EagerinitializedSingleton {
	
 private static  EagerinitializedSingleton instance=new EagerinitializedSingleton();
 private EagerinitializedSingleton() {
	 System.out.println("Singleton being intialized");
 }
 public static EagerinitializedSingleton getInstance() {
	 return instance;
 }
}
