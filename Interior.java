class Interior{

String materialNames[]=new String[11];
int index;

  boolean addMaterialName(String materialName){
  boolean isAdded=false;
  if (materialName!=null){
	  System.out.println("validation is proper...proced to add material name");
	  
  materialNames[index]=materialName;
  index++;
  isAdded=true;
  }
  return isAdded;
  
  } 

public void getMaterialNames(){
	System.out.println("list of material name");
	for(int index=0;index<materialNames.length;index++){
		System.out.println(materialNames[index]);
	}
}


}