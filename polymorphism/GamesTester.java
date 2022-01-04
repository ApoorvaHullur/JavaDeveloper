package com.xworkz.polymorphism;

public class GamesTester {
	public static void main(String args[]) {
		Games games=new Games();
		games.earningMoney();
		
		IndorGames games1=new IndorGames();
		games1.earningMoney();
		games1.anytime();
	    games1.anyTime((byte)2);
	    
	    OutdoorGames games2=new OutdoorGames();
	    games2.earningMoney();
	    games2.fitness();
	    games2.fitness((byte)2);
			
		}
		
	}


