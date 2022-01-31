package com.xworkz.linkedlist1.CRUD;

import java.util.LinkedList;

public class TestFlowersDTO {
	public static void main(String[] args) {
		FlowersDTO dto = new FlowersDTO();
		dto.setName("Rose");
		dto.setColor("Red");
		dto.setPrice(20);
		
			
		FlowersDTO dto1 = new FlowersDTO();
		dto1.setName("Jasmin");
		dto1.setColor("White");
		dto1.setPrice(30);
		
			
		Operation dao = new Operation();
		dao.insert(dto);
		dao.insert(dto1);
		dao.printAll();
			
		System.out.println();
			
		LinkedList<FlowersDTO>  update = dao.updatePriceByName("Rose", 20);
		System.out.println(update);
			
		System.out.println();
		dao.printAll();
		System.out.println();
			
	    LinkedList<FlowersDTO> delete = dao.deleteByPrice(60);
		System.out.println(delete);
		System.out.println();
		dao.printAll();
			}
		}


