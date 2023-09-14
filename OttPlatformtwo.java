class OttPlatformtwo{

String movieNames[]=new String[10];
int index;

//create/add/save
  boolean addMovieName(String movieName){
  boolean isAdded=false;
  if (movieName!=null){
	  System.out.println("validation is proper...proced to add movie name");
	  
  movieNames[index]=movieName;
  index++;
  isAdded=true;
  }
  return isAdded;
  
  } 

public void getMoviesNames(){
	
	for(int index=0;index<movieNames.length;index++){
		System.out.println(movieNames[index]);
	}
}



}