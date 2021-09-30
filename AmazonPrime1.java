class AmazonPrime1{

static String movies[]= {"Shershah","Cindrella","RakthaChaitra","JathiRathnalu","Robert","KGF","Conjuring","QuitePlace","Yuvarathna"};
static String series[]= {"Mirjapur","The Family Man","Light out","Money Heist","Four more shots","Vampire Diaries","Master","The last ship","Inside edge"};

static String serie="Lucifer";

public static void main(String a[]){
System.out.println("main method started");
getSeries(series);

String mov=getSeries(serie);
System.out.println(mov);
}

public static void getSeries(String[] series){
System.out.println("inside getseries method with String array parameter");
for(int i=0;i<series.length;i++){
System.out.println(series[i]);
}
}
public static String getSeries(String series){
System.out.println("inside getseries method");
return serie;
}
}