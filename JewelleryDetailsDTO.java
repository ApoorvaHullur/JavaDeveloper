package com.xworkz.jewelleryTask.block;

public class JewelleryDetailsDTO {
	private String jewellerytype; 
	private String metaltype;
	private String color;
	private String material;
	private String design;
	private int price;
	private float weight;
	private float carrots;
	
	
	public String getJewellerytype() {
		return jewellerytype;
	}
	public void setJewellerytype(String jewellerytype) {
		this.jewellerytype = jewellerytype;
	}
	public String getMetaltype() {
		return metaltype;
	}
	public void setMetaltype(String metaltype) {
		this.metaltype = metaltype;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getCarrots() {
		return carrots;
	}
	public void setCarrots(float carrots) {
		this.carrots = carrots;
	}
		
	public String toString() {
		return "JewlleryDetailsDTO [jewellerytype=" + jewellerytype + ", metaltype=" + metaltype + ", color=" + color
				+ ", material=" + material + ", design=" + design + ", price=" + price + ", weight=" + weight
				+ ", carrots=" + carrots + "]";
	}
	
	
	

}

	
		