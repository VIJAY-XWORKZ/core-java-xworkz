class MicroOven{

  static boolean isConnected;
  static int maxTemperature=100;
  static int currentTemperature;
  static int minTemperature;
  
  
   public static boolean onOrOf(){ 
  
  System.out.println("inside onOrOf");
  
  if (isConnected==false)
  {
  isConnected = true;
  System.out.println("the MicroOven is turned on...cool");
  }
  else if (isConnected==true)
  {
  isConnected=false; 
  System.out.println("the MicroOven is turned off");
  }
  System.out.println("end of onOrOf");
  return isConnected;
}
  
  public static void increaseTemperature(){
  System.out.println("start of increaseTemprature");
  if (isConnected==true){
		if (currentTemperature<maxTemperature){
			currentTemperature=currentTemperature+10;
			System.out.println("curerent temprature is "+currentTemperature);
			}
			else{
				System.out.println("reached maxTemperature");
				}
	}
	else
	{
	   System.out.println("katte first MicroOven on madoo...");
  }  
}
  public static void decreaseTemperature(){
	System.out.println("start of decreaseTemperature ");
	if (isConnected==true){
		if (currentTemperature>minTemperature){
			currentTemperature=currentTemperature-10;
			System.out.println("curerent temprature is "+currentTemperature);
			}
			else{
				System.out.println("Temperature is zero ");
				}
	}
	else
	{
	   System.out.println("katte first MicroOven on madoo...");
  }  
}
  
  
  
  
  

}