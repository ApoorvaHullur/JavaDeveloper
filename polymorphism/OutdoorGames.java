package com.xworkz.polymorphism;

public class OutdoorGames extends Games{
	@Override
	void earningMoney(){
		System.out.println("with outdoor games we can earn more money");
	}
	void fitness() {
		System.out.println("with outdoor games we are fit");
	}
	void Entertains() {
		System.out.println("Outdoor games gives more entertainment to audiance");
	}
	void fitness(byte minHours) {
		System.out.println("We can play for:"+ minHours+" minHours");
				
	}
}

