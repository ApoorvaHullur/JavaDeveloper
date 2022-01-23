package com.xworkz.jewelleryTask.block;

public class JewelleryOperation {
    JewelleryDetailsDTO[] details = new JewelleryDetailsDTO[5];	
    int index=0;
    public void add(JewelleryDetailsDTO names) {
    if(index<details.length ) {
    details[index]=names;
    index++;
    }
    else
    {
    }}
    public void printAll() {
    for (int index = 0; index < details.length; index++) {
    if(details[index]!=null) {
    try {
    System.out.println(details[index].toString());
    }
    catch (NullPointerException e) {
    System.err.println(e.getMessage());
    }
    }
    }}
    
    public JewelleryDetailsDTO updatePriceByJewellerytype(String jewellerytype , int price) {
    boolean check = false;
    for (int index = 0; index < details.length; index++) {
    if(jewellerytype.equals(details[index].getJewellerytype())) {
    details[index].setPrice(price);
    check=true;
    System.out.println("value updated");
    }
    if(check == false) {
    throw new UpdateNameException("Entered name is not matched");
    }}
    return null;
    }
    
    public JewelleryDetailsDTO getByMetaltype(String metaltype) {
    JewelleryDetailsDTO dto = null;
    for (int index = 0; index < details.length; index++) {
    if(metaltype.equals(details[index].getMetaltype())) {
    dto= details[index];
    System.out.println("value geted by metaltype");
   	
	return dto;
    }
    }
    
    return null;
    }
    
    JewelleryDetailsDTO updateMetaltypeBymaterial(String metaltype1, String material) {
    JewelleryDetailsDTO dto1=null;
    boolean check = false;
    for (int index = 0; index < details.length; index++) {
    if(metaltype1 .equals(details[index].getMetaltype())) {
    details[index].setMaterial(material);
    dto1=details[index];
    check=true;
    System.out.println("metaltype is updated by material");
    }}
    return dto1;
    }
    
    public String deleteByJewellerytype(String jewellerytype) {
    boolean check = false;
    for (int index = 0; index < details.length; index++) {
    if(jewellerytype.equals(details[index].getJewellerytype())) {
    details[index]=null;
    check=true;
    System.out.println("deleted sussesfuly");
    }}
    return "value deleted";
    }
    
    }

