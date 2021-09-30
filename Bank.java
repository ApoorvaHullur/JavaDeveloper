class Bank{
    
    public static String BankName="Canara Bank";
   
    public static int minAmount=2000;


public static void allow(String[] bankBalance){
System.out.println("Checking Bank Balance");
if(minAmount>2000){
System.out.println("minAmount is satisfied");
if(null!=bankBalance){
getbankDetails(bankBalance);
System.out.println("bank balance is more than minAmount");
}
else{
System.out.println("not having minAmount");

}
}
else{
System.out.println("Please maintin min Balance of 2000");
}
System.out.println("checked bank Balance"); 

}
  
 

public static void getbankDetails(String[] bankBalance){

for(int i=0;i<bankBalance.length;i++){
System.out.println(bankBalance[i]);
}
}
}