class Swiggy1Tester{

public static void main(String[] args){
System.out.println("main started");

  double price=Swiggy1.search("jeera rice");
  System.out.println("the price is"+price);
 
 double priceWithQuantity =Swiggy1.search("jeera rice",3);
 System.out.println("the price is"+priceWithQuantity);

System.out.println("main ended");
}

}