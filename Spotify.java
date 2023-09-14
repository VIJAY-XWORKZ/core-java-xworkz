class Spotify{

String songNames[]=new String[11];
	int index;
	
	public boolean addSongName(String songName){
		
		boolean isAdded =false;
		if(songNames.length>index  ){
		if(songNames != null){
		boolean exists=checkSongName(songName);
		if(exists==false){
		songNames[index]=songName;
		index ++;
		isAdded=true;
		}else{System.out.println(songName+" Song already added");}
		}
		}else{
		System.out.println("Array Index Out Of BoundsException:"+songNames.length);
		}
		return isAdded;
	}
	public boolean checkSongName(String songName){
		boolean exists=false;
		for(int index=0;index<songNames.length;index++){
			if(songNames[index]==songName){
				exists=true;
			}
		}
		return exists;
	}
	
	public void getDisplay(){
		System.out.println("list of Songs:");
		for(int index=0;index<songNames.length;index++){
			System.out.println(songNames[index]);
			
		}
	}
	



}
