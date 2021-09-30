class Country10{

static String []countryName=new String[7];


public static void main(String a[]){

   

countryName[0]="India";
countryName[1]="SriLanka";
countryName[2]="England";
countryName[3]="SouthAfrica";
countryName[4]="USA";
countryName[5]="Pakistan";
countryName[6]="China";
getCountryNames();
}


public static void getCountryNames(){
System.out.print(countryName.length);
for(int z=0;z<countryName.length;z++){
System.out.println(countryName[z]+"");
}


}
}                                           