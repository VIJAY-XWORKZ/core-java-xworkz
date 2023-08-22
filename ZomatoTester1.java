class ZomatoTester1{
 public static void main(String[]args)
 {
 System.out.println("main started");
 
 double price=Zomato1.search("leg soup");
  
 System.out.println("the price is" +price);
 
 double priceWithQuantity=Zomato1.search("leg soup",3);
 
 System.out.println("the price is" +priceWithQuantity);
 
 
 System.out.println("main ended");
 }
 }