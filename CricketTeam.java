class CricketTeam{

String players[]=new String[11];
	int index;
	
	public boolean addPlayerName(String playerName){
		
		boolean isAdded =false;
		if(players.length>index  ){
		if(players!= null){
		boolean exists=checkPlayers(playerName);
		if(exists==false){
		players[index]=playerName;
		index ++;
		isAdded=true;
		}else{System.out.println(playerName+" Player playerName already exists");}
		}
		}else{
		System.out.println("Array Index Out Of BoundsException:"+players.length);
		}
		return isAdded;
	}
	public boolean checkPlayers(String playerName){
		boolean exists=false;
		for(int index=0;index<players.length;index++){
			if(players[index]==playerName){
				exists=true;
			}
		}
		return exists;
	}
	
	public void getDisplay(){
		System.out.println("list of Team Memebers:");
		for(int index=0;index< players.length;index++){
			System.out.println(players[index]);
			
		}
		
	}
	
	

}