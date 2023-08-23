class WashingMachine{

  static boolean isConnected;
  static int maxSpeed=3;
  static int cureentSpeed;
  static int minSpeed;
  
  
   public static boolean onOrOf(){ 
  
  System.out.println("inside onOrOf");
  
  if (isConnected==false)
  {
  isConnected = true;
  System.out.println("the washingMachine is turned on...cool");
  }
  else if (isConnected==true)
  {
  isConnected=false; 
  System.out.println("the washingMachine is turned off");
  }
  System.out.println("end of onOrOf");
  return isConnected;
}
  
  public static void increaseSpeed(){
  System.out.println("start of increaseSpeed");
  if (isConnected==true){
		if (cureentSpeed<maxSpeed){
			cureentSpeed=cureentSpeed+1;
			System.out.println("curerent Speed is "+cureentSpeed);
			}
			else{
				System.out.println(" washingMachine reached  maxSpeed");
				}
	}
	else
	{
	   System.out.println("bro first washingMachine on madiii...");
  }  
}
  public static void decreaseSpeed(){
	System.out.println("start of decrease Speed ");
	if (isConnected==true){
		if (cureentSpeed>minSpeed){
			cureentSpeed=cureentSpeed-1;
			System.out.println("curerentSpeed is "+cureentSpeed);
			}
			else{
				System.out.println("Speed is zero ");
				}
	}
	else
	{
	   System.out.println("bro first washingMachine on madii...");
  }  
}
  
  
  
  
  

}