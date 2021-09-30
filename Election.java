class Election{
    
    public static String candidateName="Yadiyurappa";
   
    public static int totalVotes=100000;


public static void allow(String[] voterId){
System.out.println("Election votes started");
if(totalVotes>500000){
System.out.println("Election votes counting ");
if(null!=voterId){
getVoterIdDetails(voterId);
System.out.println("Allowed to voted");
}
else{
System.out.println("Not allowed to voted");
}
}
else{
System.out.println("please allow to voted");
}
System.out.println("End of Election");
}
  
public static void getVoterIdDetails(String[] voterId){

for(int i=0;i<voterId.length;i++){
System.out.println(voterId[i]);
}
}
}