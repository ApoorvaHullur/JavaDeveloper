package com.xworkz.collections.CRUD;
import java.util.ArrayList;
public class Operation {
ArrayList<ChocolateDTO> chocolate = new ArrayList<ChocolateDTO>();
	public void insert(ChocolateDTO obj) {
		chocolate.add(obj);
		System.out.println("values inserted---");
	}
	public void printAll() {
	for (ChocolateDTO chocalateDTO : chocolate) {
	System.out.println(chocalateDTO.toString());
		}
	}
	public ArrayList<ChocolateDTO> updatePriceByName(String name,int price){
		for (ChocolateDTO chocalateDTO : chocolate) {
			if(name.equals(chocalateDTO.getName())) {
				chocalateDTO.setPrice(price);
	}
			}
		return chocolate;
	}
	public ArrayList<ChocolateDTO> deleteByPrice(int price){
		for (ChocolateDTO chocalateDTO : chocolate) {
			if(price == chocalateDTO.getPrice()) {
				chocolate  =null;
				
	}}
		return chocolate;
	}}
