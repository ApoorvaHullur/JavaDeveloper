class ShowRoom{



public String showRoomName;
public String productName;
public int cost;



public ShowRoom(String srname,String pn,int cs){
System.out.println("ShowRoom object is created");
showRoomName=srname;
productName=pn;
cost=cs;


}


public static void main(String a[]){
ShowRoom show=new ShowRoom("TravelShowRoom","Nanocar",500000);
ShowRoom show1=new ShowRoom("BataShowRoom","Running shoe",3500);






}
}


