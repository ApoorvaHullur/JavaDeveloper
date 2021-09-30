import java.util.Scanner;
class Exam4Util{
static String[] hallTicket=new String[3];

public static void main(String a[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the candidate name");
String candidateName=sc.next();

System.out.println("Enter the USN No");
String usnNo=sc.next();

System.out.println("Enter the Subject");
String subjectName=sc.next();

hallTicket[0]=candidateName;
hallTicket[1]=usnNo;
hallTicket[2]=subjectName;

System.out.println("main method started");
Exam4.allow(hallTicket);
Exam4.allow(1100);
System.out.println("main method ended");
}
}