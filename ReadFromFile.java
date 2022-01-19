package com.xworkz.readfromfile;
import java.io.*;
public class ReadFromFile {
public static void main(String[] args) throws IOException{
	File file=new File("C:\\Users\\HP\\Desktop\\test.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
    String st;
	while((st=br.readLine())!=null)
System.out.println(st);
}
}
