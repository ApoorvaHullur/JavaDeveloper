class KarnatakaAirports10{

static String []domesticAirports=new String[6];

public static void main(String a[]){

domesticAirports[0]="Belagavi Airport";
domesticAirports[1]="Hubballi Airport";
domesticAirports[2]="Kalaburgi Airport";
domesticAirports[3]="Bidar Airport";
domesticAirports[4]="Jindal Vijayanagar Airport";
domesticAirports[5]="Mysore Airport";
getDomesticAirports();
}

public static void getDomesticAirports(){
System.out.print(domesticAirports.length);
for(int z=0;z<domesticAirports.length;z++){
System.out.println(domesticAirports[z]+"");
}


}
}                                                                                         