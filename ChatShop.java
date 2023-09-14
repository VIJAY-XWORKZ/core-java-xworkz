class ChatShop{

String chatNames[]=new String[10];
	int index;
	
	public boolean addChatName(String chatName){
		boolean isAdded =false;
		if(chatNames.length>index  ){
		if( chatNames != null){
		boolean exists=checkChatNames(chatName);
		if(exists==false){
			
		chatNames[index]=chatName;
		index ++;
		isAdded=true;
		}else{
			System.out.println(chatName+"Already exested");
		}
		}
		}else{System.out.println("Array Index Out Of BoundsException:"+chatNames.length);}
					
		return isAdded;
	}
	
	public boolean checkChatNames(String chatName){
		boolean exists=false;
		for(int index=0;index<chatNames.length;index++){
			if(chatNames[index]==chatName){
				exists=true;
				
			}
		}
		return exists;
	}
	
	public void getDisplay(){
		System.out.println("list of Chat Menu:");
		for(int index=0;index< chatNames.length;index++){
			System.out.println(chatNames[index]);
			
		}
	}
	
	


}
