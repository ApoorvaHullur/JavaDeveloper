class Ncr{

 public static void main(String a[]){
  
  int nCr=fact(5)/(fact(2)*fact(5-2));
System.out.println(nCr);
}

public static int fact(int num){
System.out.println("fact method started");
int fact=1;
for(int i=1;i<=num;i++){
fact=fact*i;

}

System.out.println("fact method ended");
return fact;


}
}