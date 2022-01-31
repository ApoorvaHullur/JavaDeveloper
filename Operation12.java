package com.xworkz.linkedlist1.CRUD;
import java.util.LinkedList;

public class Operation {
	LinkedList<FlowersDTO> flowers = new LinkedList<FlowersDTO>();
	public void insert(FlowersDTO obj) {
		flowers.add(obj);
		System.out.println("values inserted---");
	}
	public void printAll() {
	for (FlowersDTO flowersDTO : flowers) {
	System.out.println(flowersDTO.toString());
		}
	}
	public LinkedList<FlowersDTO> updatePriceByName(String name,int price){
		for (FlowersDTO flowersDTO : flowers) {
			if(name.equals(flowersDTO.getName())) {
				flowersDTO.setPrice(price);
	}
			}
		return flowers;
	}
	public LinkedList<FlowersDTO> deleteByPrice(int price){
		for (FlowersDTO flowersDTO : flowers) {
			if(price == flowersDTO.getPrice()) {
				flowers  =null;
				
	}}
		return flowers;
	}}


