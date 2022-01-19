package com.xworkz.singleton;

public class AdharCard {
	private static AdharCard adharcard=null;
	String name;
	private AdharCard() {
		System.out.println("AdharCard number is generated");
	}
	public static void getAdharCard() {
		if(adharcard==null) {
			adharcard=new AdharCard();
		}
		else {
			System.out.println("Adharcard not generated");
			
					
		}
	}

}
