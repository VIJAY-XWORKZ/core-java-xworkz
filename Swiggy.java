class Swiggy{

 public static double search( String foodName){
 double price = 0.0;
   System.out.println("invocked search:foodName(String)");
   
   if (foodName=="rice"){
   price = 160.00;
   return price;}
 }
}