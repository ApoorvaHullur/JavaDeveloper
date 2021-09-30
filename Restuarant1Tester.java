class Restuarant1Tester{

public static void main(String a[]){

  Restuarant1 rest=new Restuarant1();
   rest.restuarant1Name="1947";
   rest.type="veg";
   rest.location="Malleshwaram";
   rest.ownerName="Sadananda Gowda";
   rest.restuarant1Id=456;


 rest.serveFood();
rest.displayRestuarant1();

 Restuarant1 rest1=new Restuarant1();
   rest1.restuarant1Name="Empire";
   rest1.type="Non-veg";
   rest1.location="Koramangala";
   rest1.ownerName="Somesh";
   rest1.restuarant1Id=129;
rest1.serveFood();
rest1.displayRestuarant1();

}
}