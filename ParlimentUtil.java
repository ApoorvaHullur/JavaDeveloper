class ParlimentUtil{

public static void main(String a[]){

  Parliment parli=new Parliment();
   parli.parlimentName="BJP";
   parli.noOfMembers=301;


 parli.parties();

System.out.println(parli.parlimentName+" "+parli.noOfMembers);


 Parliment parli1=new Parliment();
   parli1.parlimentName="INC";
   parli1.noOfMembers=52;

System.out.println(parli1.parlimentName+" "+parli1.noOfMembers);

Parliment parli2=new Parliment();
   parli2.parlimentName="JD";
   parli2.noOfMembers=16;


System.out.println(parli2.parlimentName+" "+parli2.noOfMembers);
}
}