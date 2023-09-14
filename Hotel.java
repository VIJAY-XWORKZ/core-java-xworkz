class Hotel{

String menu[]=new String[11];
int index;


  boolean addFoodName(String foodName){
  boolean isAdded=false;
  if (foodName!=null){
	  System.out.println("validation is proper...proced to add food name");
	  
  menu[index]=foodName;
  index++;
  isAdded=true;
  }
  return isAdded;
  
  } 

public void getMenu(){
	
	for(int index=0;index<menu.length;index++){
		System.out.println(menu[index]);
	}
}





}