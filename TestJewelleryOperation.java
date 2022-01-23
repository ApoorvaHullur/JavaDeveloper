package com.xworkz.jewelleryTask.block;

public class TestJewelleryOperation {
public static void main(String[] args) {
		
 JewelleryDetailsDTO dto = new JewelleryDetailsDTO();
 JewelleryDetailsDTO dto1 = new JewelleryDetailsDTO();
 dto.setJewellerytype("Brcellet");
 dto.setMetaltype("Silver");
 dto.setColor("Silvercolor");
 dto.setMaterial("Bangalore");
 dto.setDesign("Chain");
 dto.setPrice(2500);
 dto.setWeight(3.6f);
 dto.setCarrots(00.2f);
		
 dto1.setJewellerytype("Neckles");
 dto1.setMetaltype("Gold");
 dto1.setColor("Goldcolor");
 dto1.setMaterial("copper");
 dto1.setDesign("Temple");
 dto1.setPrice(150000);
 dto1.setWeight(7.6f);
 dto1.setCarrots(4.166f);
		
		
 JewelleryOperation operation = new JewelleryOperation();
 operation.add(dto);
 operation.add(dto1);
 operation.printAll();
 System.out.println();
 try {
 JewelleryDetailsDTO update=operation.updatePriceByJewellerytype("Neckles", 150000);
 System.out.println(update.toString());
 }catch 
 (NullPointerException e)
 {
 System.err.println(e.getMessage());
 }
 operation.printAll();
 System.out.println();
  try {
	  
  JewelleryDetailsDTO get = operation.getByMetaltype("Gold");
  System.out.println(get.toString());
  }catch (Exception e) {
  System.err.println(e.getMessage());
  }
  System.out.println();
  try 
  {
  JewelleryDetailsDTO update1 = operation.updateMetaltypeBymaterial("Gold", "24carrot");
  System.out.println(update1.toString());
  }
  catch (Exception e) {
  }
	operation.printAll();
	System.out.println();
	try {
	 String  delete = operation.deleteByJewellerytype("Neckles");
	 System.out.println(delete);
	}catch
	(Exception e) {
	}
	 operation.printAll();
	}}

