class Exam2{
    
    public static String universityName="VTU";
   
    public static int fees=1350;


public static void allow(String[] hallTicket){
System.out.println("inside allow method");
if(fees>1000){
System.out.println("Fees is paid show me the hallticket");
if(null!=hallTicket){
getHallTicketDetails(hallTicket);
System.out.println("Allowed to write exam");
}
else{
System.out.println("No HallTicket Found");

}
}
else{
System.out.println("Please pay the fees");
}
System.out.println("end of allow method"); 

}
  
 

public static void getHallTicketDetails(String[] hallTicket){

for(int i=0;i<hallTicket.length;i++){
System.out.println(hallTicket[i]);
}
}
}