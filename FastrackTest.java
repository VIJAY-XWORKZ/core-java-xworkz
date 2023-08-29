class FastrackTest {

	public static void main(String args[]) {
	
Fastrack fastrack =new Fastrack();
fastrack.fastrackId =1;
fastrack.displayType= "digital";
fastrack.diaInmm =11;
fastrack.price=6995;
fastrack.color="white";
fastrack.strap="metal";

fastrack.provideFashion();
System.out.println("fastrack id is "+fastrack.fastrackId);
System.out.println("fastrack type is "+ fastrack.displayType); 
System.out.println("fastrack weight In Grams is "+ fastrack.diaInmm);
System.out.println("fastrack price is "+ fastrack.price); 
System.out.println("fastrack design is "+fastrack.color); 
System.out.println("fastrack occasions is "+fastrack.strap);

Fastrack fastrack1 =new Fastrack();
fastrack1.fastrackId =2;
fastrack1.displayType= "digital";
fastrack1.diaInmm =12;
fastrack1.price=3500;
fastrack1.color="grey";
fastrack1.strap="leather";

fastrack1.provideFashion();

System.out.println("fastrack id is "+fastrack1.fastrackId);
System.out.println("fastrack type is "+ fastrack1.displayType); 
System.out.println("fastrack weight In Grams is "+ fastrack1.diaInmm);
System.out.println("fastrack price is "+ fastrack1.price); 
System.out.println("fastrack design is "+fastrack1.color); 
System.out.println("fastrack occasions is "+fastrack1.strap);
 


	}
}