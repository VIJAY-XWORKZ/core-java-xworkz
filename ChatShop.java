class ChatShop{

String chatNames[]=new String[11];
int index;

  boolean addChatName(String chatName){
  boolean isAdded=false;
  if (chatName!=null){
	  System.out.println("validation is proper...proced to add chat name");
	  
  chatNames[index]=chatName;
  index++;
  isAdded=true;
  }
  return isAdded;
  
  } 

public void getChatNames(){
	
	for(int index=0;index<chatNames.length;index++){
		System.out.println(chatNames[index]);
	}
}



}
