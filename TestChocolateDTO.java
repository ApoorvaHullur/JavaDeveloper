package com.xworkz.collections.CRUD;
import java.util.ArrayList;

public class TestChocolateDTO {
	public static void main(String[] args) {
	ChocolateDTO dto = new ChocolateDTO();
	dto.setName("Kitkat");
	dto.setPrice(20);
	dto.setWeight(15);
	dto.setCalories(50.67f);
		
	ChocolateDTO dto1 = new ChocolateDTO();
	dto1.setName("5Star");
	dto1.setPrice(10);
	dto1.setWeight(30f);
	dto1.setCalories(78.78f);
		
	Operation dao = new Operation();
	dao.insert(dto);
	dao.insert(dto1);
	dao.printAll();
		
	System.out.println();
		
	ArrayList<ChocolateDTO>  update = dao.updatePriceByName("Kitkat", 20);
	System.out.println(update);
		
	System.out.println();
	dao.printAll();
	System.out.println();
		
	ArrayList<ChocolateDTO> delete = dao.deleteByPrice(60);
	System.out.println(delete);
	System.out.println();
	dao.printAll();
		}
	}
