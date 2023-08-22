class Swiggy1{

public static double search(String foodName) {
   double price = 0.0;
  System.out.println("invoked serach :foodName(String)");
  
   if(foodName=="pizza"){
   price=110.00;
   }
   if(foodName=="jeera rice"){
   price = 220.00;
   }
  if(foodName=="veg biriyani"){ 
  price=230.00;
  }
 
 System.out.println("end of serach with one parameters");
 return price;
}
  public static double search(String foodName,int quantity) {
   double price = 0.0;
   //double quantity=3;
  System.out.println("invoked serach :foodName(String)");
  
   if(foodName=="pizza"){
   price=110.00*quantity;
   }
   if(foodName=="jeera rice"){
   price = 220.00*quantity;
   }
  if(foodName=="veg biriyani"){ 
  price=230.00*quantity;
  }
 
 System.out.println("end of serach with two parameters");
 return price;
}
}