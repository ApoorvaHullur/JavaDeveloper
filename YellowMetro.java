package com.xworkz.metro;

import com.xworkz.metro.details.PurpleMetro;

public class YellowMetro extends PurpleMetro {
	@Override
	public void greenline() {
		 System.out.println("Starting from Nagasandra to Yelachanahalli");
	}
	@Override
	   public void purpleline() {
		   System.out.println("Starting from Baiyapanahalli to Mysore road");
	   }
	@Override
	public void yellowline() {
		System.out.println("Starting from Nagarbavi to Rajajinagar");	
	}
}


