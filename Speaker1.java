class Speaker1{

    static String name="Boat";
    static int minVolume=15;
    static int maxVolume=0;
    static boolean isConnected=false;
    static int currentVolume;

public static boolean onOrOff(){
  if(isConnected==false){
   isConnected=true;
   return isConnected;
}
else{
return isConnected;
    }
  }



public static void decreaseVolume(){
System.out.println("inside decreaseVolume()");
if(isConnected){
   if(currentVolume>=maxVolume){
   currentVolume=currentVolume+1;
System.out.println("The current Volume is:"+currentVolume);
}
else{
System.out.println("MinVolume reached....");
}
}
System.out.println("end of decreaseVolume() ");
}



















}