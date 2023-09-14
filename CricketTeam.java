class CricketTeam{


String players[]=new String[11];
int index;


  boolean addPlayerName(String playerName){
  boolean isAdded=false;
  if (playerName!=null){
	  System.out.println("validation is proper...proced to add player name");
	  
 players[index]=playerName;
  index++;
  isAdded=true;
  }
  return isAdded;
  
  } 

public void getPlayers(){
	
	for(int index=0;index<players.length;index++){
		System.out.println(players[index]);
	}
}

}