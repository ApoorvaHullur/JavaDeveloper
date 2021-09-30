class GoogleUtil{

public static void main(String a[]){

  Google goog=new Google();
   goog.companyName="Google";
   goog.type="LLC";
   goog.location="America";
   goog.ownerName="Larry Page and Sergey Brin";
   goog.numberOfEmployes=139995;


 goog.services();

System.out.println(goog.companyName+" "+goog.type+" "+goog.location+" "+goog.ownerName+" "+goog.numberOfEmployes);



}
}