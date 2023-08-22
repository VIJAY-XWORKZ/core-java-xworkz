class FactorialM
{

public static void main(String[]fac){
	System.out.println("getfact started");
	getfact(6);
	getfact(7);
	getfact(9);
}
	
	public static void getfact(int factNumber){
   int dummy=1;
  for (int fact=1 ;fact<=factNumber;fact++){
  dummy = dummy*fact;  
  }
  System.out.println(" the fact Number of " +factNumber  +" "+dummy);
  System.out.println("getfact ended");
 }
} 
  