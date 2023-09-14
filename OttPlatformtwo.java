class OttPlatformtwo{

String movieNames[]=new String[10];
	int index;
	
	public boolean addMovieName(String movieName){
		//System.out.println();
		boolean isAdded =false;
		
		
		if(movieNames.length>index)
		{
			if(movieNames != null){
			boolean exists=checkMovieNames(movieName);
			if(exists==false){
				movieNames[index]=movieName;
				index ++;
				isAdded=true;
				}
				else{
				System.out.println(movieName+" Already exists");
			}
			}
			}else{System.out.println("Array Index Out Of BoundsException:"+movieNames.length);}
		return isAdded;
	}
	public boolean checkMovieNames(String movieName){
		boolean exists=false;
		//System.out.println("inside checking ");
		for(int index=0;index< movieNames.length;index++){
			if(movieNames[index]==movieName){
				exists=true;
			}
		}
		return exists;
	}
	
	
	
	public void getDisplay(){
		System.out.println("list of movies:");
		for(int index=0;index< movieNames.length;index++){
			System.out.println(movieNames[index]);
			
		}	
	}	
 


}