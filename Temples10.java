class Temples10{


static String []templesInBagalkot=new String[6];



public static void main(String a[]){
templesInBagalkot[0]="Balaji Mandir";
templesInBagalkot[1]="Shiv Mandir";
templesInBagalkot[2]="Durgadevi";
templesInBagalkot[3]="Hanuman";
templesInBagalkot[4]="Kalikadevi";
templesInBagalkot[5]="Kenchammadevi";
getTemplesInBagalkot();
}


public static void getTemplesInBagalkot(){
System.out.print(templesInBagalkot.length);
for(int z=0;z<templesInBagalkot.length;z++){
System.out.println(templesInBagalkot[z]+"");
}


}
}                                                  