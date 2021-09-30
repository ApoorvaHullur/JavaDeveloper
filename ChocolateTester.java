class ChocolateTester{

public static void main(String a[]){

  Chocolate chocolate=new Chocolate();
     chocolate.name="KitKat";
     chocolate.price=25;
     chocolate.color="Red";
     
System.out.println(chocolate.chocoes+" "+chocolate.name+" "+chocolate.price+" "+chocolate.color);
    chocolate.write();


Chocolate chocolate1=new Chocolate();
     
     chocolate1.name="Dairymilk";
     chocolate1.price=20;
     chocolate1.color="Blue";
     
System.out.println(chocolate1.chocoes+" "+chocolate1.name+" "+chocolate1.price+" "+chocolate1.color);
    chocolate1.write();

 Chocolate chocolate2=new Chocolate();
     chocolate2.name="MilkyBar";
     chocolate2.price=10;
      chocolate2.color="yellow";
     
System.out.println(chocolate2.chocoes+" "+chocolate2.name+" "+chocolate2.price+" "+chocolate2.color);
    chocolate2.write();

}

}