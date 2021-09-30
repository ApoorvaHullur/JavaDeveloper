class CitiesInKarnatakaUtil{

public static void main(String[] args){
CitiesInKarnataka cities=new CitiesInKarnataka();
   cities.cityName="Bangalore";
   cities.rank=1;
   cities.population=8495492L;


 cities.citydetails();

System.out.println(cities.cityName+" "+cities.rank+" "+cities.population);


CitiesInKarnataka cities1=new CitiesInKarnataka();
   cities1.cityName="Hubli";
   cities1.rank=2;
   cities1.population=943788L;
System.out.println(cities1.cityName+" "+cities1.rank+" "+cities1.population);

CitiesInKarnataka cities2=new CitiesInKarnataka();
   cities2.cityName="Mysure";
   cities2.rank=3;
   cities2.population=920550L;



System.out.println(cities2.cityName+" "+cities2.rank+" "+cities2.population);
}
}