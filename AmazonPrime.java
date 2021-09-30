class AmazonPrime{

static String movies[]= {"Shershah","Cindrella","RakthaChaitra","JathiRathnalu","Robert","KGF","Conjuring","QuitePlace","Yuvarathna"};
static String series[]= {"Mirjapur","The Family Man","Light out","Money Heist","Four more shots","Vampire Diaries","Master","The last ship","Inside edge"};

static String movie="Dia";

public static void main(String a[]){
System.out.println("main method started");
getMovies(movies);

String mov=getMovies(movie);
System.out.println(mov);
}

public static void getMovies(String[] movies){
System.out.println("inside getmovies method with String array parameter");
for(int i=0;i<movies.length;i++){
System.out.println(movies[i]);
}
}
public static String getMovies(String movies){
System.out.println("inside getmovies method");
return movie;
}
}