package com.xworkz.chocolates.List;


import java.util.ArrayList;
public class Chocolates {
public static void main(String args[]) {
	ArrayList list=new ArrayList();
	list.add("KitKat");
	list.add("DairyMilk");
	System.out.println(list);
	list.add(1,"silk");
	System.out.println(list);
	list.set(2,"milk");
	int index=list.lastIndexOf("milk");
	System.out.println(index);
	System.out.println(list);
	
}
}
