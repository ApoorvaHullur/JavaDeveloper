class Exam30{



public String universityName;
public int fees;



public Exam30(String name,int fs){
System.out.println("Exam object is created");
universityName=name;
fees=fs;


}


public static void main(String a[]){
Exam30 exam=new Exam30("VTU",1350);
Exam30 exam1=new Exam30("RCUB",1350);
Exam30 exam2=new Exam30("KU",1350);




}
}


