class Telecom{
    
    public static String CompanyName="Airtel Ltd";
   
    public static int rechargeupto=56;


public static void allow(String[] dataPackAndTalktime){
System.out.println("Recharging Airtel SIM");
if(rechargeupto>56){
System.out.println("Airtel pack is going to expire");
if(null!=dataPackAndTalktime){
getrechargingDetails(dataPackAndTalktime);
System.out.println("Airtel Pack is valid");
}
else{
System.out.println("Your Airtel Pack is Expired");

}
}
else{
System.out.println("Renew your pack!Recharge with any unlimited pack to continue services");
}
System.out.println("Recharge is successful"); 

}
  
 

public static void getrechargingDetails(String[] dataPackAndTalktime){

for(int i=0;i<dataPackAndTalktime.length;i++){
System.out.println(dataPackAndTalktime[i]);
}
}
}