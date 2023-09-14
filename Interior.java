class Interior{

String material[]=new String[10];
	int index;
	
	public boolean addMaterialName(String materialName){
		boolean isAdded =false;
		if(material.length>index  ){
		if(material != null){
		boolean exists=checkMaterialName(materialName);
		if(exists==false){
		material[index]=materialName;
		index ++;
		isAdded=true;
		}else{System.out.println(materialName+" Meterial Already exists");}
		}
		}else{
		System.out.println("Array Index Out Of BoundsException:"+material.length);
		}
		return isAdded;
	}
	public boolean checkMaterialName(String materialName){
		boolean exists=false;
		for(int index=0;index<material.length;index++){
			if(material[index]==materialName){
				exists=true;
			}
		}
		return exists;
	}
	
	public void getDisplay(){
		System.out.println("list of Meterial materialNames:");
		for(int index=0;index<material.length;index++){
			System.out.println(material[index]);
			
		}
	}
	


}