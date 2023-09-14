class Spotify{

String songNames[]=new String[11];
int index;

  boolean addSongName(String songName){
  boolean isAdded=false;
  if (songName!=null){
	  
	  
  songNames[index]=songName;
  index++;
  isAdded=true;
  }
  return isAdded;
  
  } 

public void getSongNames(){
	System.out.println("list of material name");
	for(int index=0;index<songNames.length;index++){
		System.out.println(songNames[index]);
	}
}



}
