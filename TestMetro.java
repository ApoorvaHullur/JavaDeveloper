package com.xworkz.metro;
import com.xworkz.metro.details.Metro;
import com.xworkz.metro.details.PurpleMetro;
public class TestMetro {
	public static void main(String args[]) {
		YellowMetro metro=new YellowMetro();
		metro.yellowline();
		metro.purpleline();
		
		YellowMetro metro1=new YellowMetro();
		metro.greenline();
	}
}
