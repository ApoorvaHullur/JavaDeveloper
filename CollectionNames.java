package com.xworkz.collectionNames.Names;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionNames {
	


public static void main(String args[]) {
	
	   ArrayList<String> arrayList =new ArrayList();
	   arrayList.add("Kitkat");
	   arrayList.add("Milkybar");
	   arrayList.add("Munch");
	   arrayList.add("DM");
	   arrayList.add("Snikers");
	   
	   
	   
	   
	     Iterator list= arrayList.iterator();
	     int count=0;
	     while(list.hasNext()) {
	    	 if(count<5) {
		   String data=(String)list.next();
		   System.out.println(data);
		   count++;
	   }
	     }
	   
	  // for(String data:arrayList) {
	    	//System.out.println(data);
	    	
	  
	    }
	  
   }

