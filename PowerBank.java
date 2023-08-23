class PowerBank{

  static boolean isConnected;
  static int maxBattery%=100%;
  static int cureentBattery%;
  static int minBattery%;
  
  
   public static boolean onOrOf(){ 
  
  System.out.println("inside onOrOf");
  
  if (isConnected==false)
  {
  isConnected = true;
  System.out.println("the PowerBank is turned on...run");
  }
  else if (isConnected==true)
  {
  isConnected=false; 
  System.out.println("the PowerBank is turned off");
  }
  System.out.println("end of onOrOf");
  return isConnected;
}
  
  public static void increaseBattery%(){
  System.out.println("start of increaseBattery%");
  if (isConnected==true){
		if (currentBattery%<maxBattery%){
			currentBattery%=currentBattery%+1;
			System.out.println("curerent Battery% is "+currentBattery%);
			}
			else{
				System.out.println(" PowerBank reached  maxBattery%");
				}
	}
	else
	{
	   System.out.println("bro first PowerBank on madiii...");
  }  
}
  public static void decreaseBattery%(){
	System.out.println("start of decrease Battery%");
	if (isConnected==true){
		if (currentBattery%>minBattery%){
			currentBattery%=currentBattery%-1;
			System.out.println("curerentBattery% is "+currentBattery%);
			}
			else{
				System.out.println("Battery% is zero ");
				}
	}
	else
	{
	   System.out.println("bro first PowerBank on madii...");
  }  
}
  
  
  
  
  

}