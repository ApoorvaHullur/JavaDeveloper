class Exam20{
    
    public String universityName;
   
    public int fees;
public Exam(String universityName,int fs){

System.out.println("Exam object is created");
universityName=name;
fees=fs;

public static void allow(String[] hallTicket){
System.out.println("start of allow method");
if(hallTicket!=null){
getHallTicketDetails(hallTicket);
}
else{
System.out.println("No HallTicket Found");

}
System.out.println("end of allow method with HallTicket ");
}

 
public static void allow(int fees){
System.out.println("start of allow method with fees");
if(fees>1000){
System.out.println(fees);
}
else{
System.out.println("Gubeeee.......Please pay the fees"); 
}
System.out.println("end of the allow method with fees");
}

public static void getHallTicketDetails(String[] hallTicket){

for(int i=0;i<hallTicket.length;i++){
System.out.println(hallTicket[i]);
}
}
}