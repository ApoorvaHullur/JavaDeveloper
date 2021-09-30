class RestuarantTester{

public static void main(String a[]){

  Restuarant rest=new Restuarant();
   rest.restuarantName="1947";
   rest.type="veg";
   rest.location="Malleshwaram";
   rest.ownerName="Sadananda Gowda";
   rest.restuarantId=456;


 rest.serveFood();

System.out.println(rest.restuarantName+" "+rest.type+" "+rest.location+" "+rest.ownerName+" "+rest.restuarantId);


 Restuarant rest1=new Restuarant();
   rest1.restuarantName="Empire";
   rest1.type="Non-veg";
   rest1.location="Koramangala";
   rest1.ownerName="Somesh";
   rest1.restuarantId=129;
System.out.println(rest1.restuarantName+" "+rest1.type+" "+rest1.location+" "+rest1.ownerName+" "+rest1.restuarantId);


}
}