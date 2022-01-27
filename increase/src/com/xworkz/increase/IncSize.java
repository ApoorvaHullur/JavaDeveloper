package com.xworkz.increase;

public class IncSize {
	public static int[] increaseSize(int[] arr)
	    {
	int[] newArr = new int[arr.length + 1];
	//Creating a new array with space for an extra element
	for(int i = 0; i < arr.length; i++)
	{
	newArr[i] = arr[i];//Copying the elements to the new array
	}
	
	return newArr;
	}
	public static void main(String[] args)
	 {
	 int[] arr = new int[5];
	  int counter = 0;
	   for(int i = 0; i <= 6; i++)
	  {
	  if(counter == arr.length)
	  {
	   arr = increaseSize(arr);
	   }
	   arr[i] = i*2;
	   counter += 1;
	   }
	  for(int i=0; i<arr.length; i++)
	  {
	   System.out.print(arr[i]+" ");
	   }
	    }
	    }
