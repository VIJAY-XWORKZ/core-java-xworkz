class SuperMarket {

	 static String fruits[] ={"mango","grapes","kiwi","orange","jackfruit","apple","pineapple","papaya","gooseberry","cherry","strawberry","pomegranate","coconu","pear","banana"}; 
	 static String biscuits[] ={"50-50","oreo","bourbon","mari gold","good day","chaska maska","britannia","parle g","patanjali","sunfeast ","chocalate cram biscuit","fab","momos magic","","lemon puff"};
	 static String snacks[] ={"puffcorn","kurkure","cake","lays","bread","popcorn","candies","brownies","crackers","namkeen","mixture","moongdal","corn snacks","gems","orbit"};
	 static String perfumes[] ={"rahil","angelo","miss dior","secret","nike","yardley","engage","fogg","black opium","denver","vanderbilt","born wild","gucci","mixed emotions","versace"};
	 static String chocalates[] ={"munch","kitkate","ferror rocher","dark chocalate","candyman","melody",dairy milk","milky bar","perk","5 star",sneakers","kinder","coffee bite","bounty","hersheys"};
	 static String vegetables[] ={"potato","radish","lady's finger","carrot","beetroot","beans","peas","broccoli","pumpkin","mushroom","tomato","onion","spinach","capsicum","drumstick"};
	 static String soaps[] ={"rin","himalaya","medimix","cinthol","vim","dove","lux","dettol","lifebuoy","mysore sandal","santoor","pears","arasan","hamam","nivea"};
	 static String groceries[] ={"egg","corn flour","pepper powder","pasta","maggie","yipee","rice","wheat flour","ragi flour","chilli powder","chicken masala","mutton masala","meat","butter","cooking oil"};
	 static String iceCream[] ={"cookie dough","neapolitan","mint chocalate chip","buttered pecan","black current","venilla","cookie n cream","pistachio","rocky load","butter pecan","coffee pudge","pranline and cream","salted caramel","almond ","sundae"};
	 static String softDrinks[] ={"sprite","unhealthyza","limda","7up","artos","soda","power drink","sunkist","pepsi ","coke","merinda","fanta","frooti","slice","tizer"};
	
	public static void main (String args[]) {
		 getfruits();
		 getbiscuits();
		 getperfumes();
		 getchocalates();
		 getvegetables();
		 getsoaps();
		 getsnacks();
		 getgroceries();
		 geticeCream();
		 getsoftDrinks();
}
	 
       public static void getChocalates() {
	 System.out.println(chocalates.length);
	 System.out.println("the available chocalates are");
    for (int choco=0; choco<chocalates.length ; choco++) {
	 System.out.println(chocalates[choco]) ; 
	 }
	 
 for (int choco=chocalates.length-1 ; choco>=0 ; choco--) {
	  System.out.println(chocalates[choco]);
	  }
}
	 
   public static void getBiscuits() {
	 System.out.println(biscuits.length);
	 System.out.println("the available biscuits are");
	 
   for (int biscut=0; biscut<biscuits.length ; biscut++) {
      System.out.println(biscuits[biscut]) ;
	  }
	  
    for (int biscut=biscuits.length-1 ; biscut>=0 ; biscut--) {
	 System.out.println(biscuits[biscut]);
	 }
}
	 
public static void getPerfumes() {
	 System.out.println(perfumes.length);
	 System.out.println("the available perfumes are");
 for (int fume=0; fume<perfumes.length ; fume++) {
	 System.out.println(perfumes[fume]) ;
	 }
 for (int fume=perfumes.length-1 ; fume>=0 ; fume--) {
	 System.out.println(perfumes[fume]);
	 }
}
	 
public static void getFruits() {
	 System.out.println(fruits.length);
	 System.out.println("the available fruits are");
 for (int store=0; store<fruits.length ; store++) {
	 System.out.println(fruits[store]) ;
	 }
 for (int store=fruits.length-1 ; store>=0 ; store--) {
	 System.out.println(fruits[store]); 
	 }
}
	 
public static void getVegetables() {
	 System.out.println(vegetables.length);
	 System.out.println("the available vegetables are");
	 
     for (int veg=0; veg<vegetables.length ; veg++) {
	 System.out.println(vegetables[veg]) ;
	 }
	 
      for (int veg=vegetables.length-1 ; veg>=0 ; veg--) {
	 System.out.println(vegetables[veg]);
	 }
}
	 
      public static void getSnacks() {
	 System.out.println(snacks.length);
	 System.out.println("the available snacks are");
	 
     for (int unhealthy=0; unhealthy<snacks.length ; unhealthy++) {
	 System.out.println(snacks[unhealthy]) ; 
	 }
	 
    for (int unhealthy=snacks.length-1 ; unhealthy>=0 ; unhealthy--) {
	 System.out.println(snacks[unhealthy]);
	 }
}
	 
      public static void getGroceries() {
	 System.out.println(groceries.length);
	 System.out.println("the available grocieries are");
	 
    for (int protein=0; protein<groceries.length ; protein++) {
	 System.out.println(groceries[protein]) ;
	 }
 for (int protein=groceries.length-1 ; protein>=0 ; protein--) {
	 System.out.println(groceries[protein]);
	 }
}
	 
public static void getIceCream() {
	 System.out.println(iceCream.length);
	 System.out.println("the available iceCream are");
 for (int favorite=0; favorite<iceCream.length ; favorite++) {
	 System.out.println(iceCream[favorite]) ;
	 }
 for (int favorite=iceCream.length-1 ; favorite>=0 ; favorite--) {
	 System.out.println(iceCream[favorite]); 
	 }
}
	 
    public static void getSoftDrinks() {
     System.out.println(softDrinks.length);
	 System.out.println("the available softDrinks are");
	 
     for (int unwo=0; unwo<softDrinks.length ; unworthy++) {
	 System.out.println(softDrinks[unworthy]) ;
	 }
    for (int unworthy=softDrinks.length-1 ; unworthy>=0 ; unworthy--) {
	 System.out.println(softDrinks[unworthy]);
	 }
}
	 
    public static void getSoaps() {
	 System.out.println(soaps.length);
	 System.out.println("the available soaps are");
	 
   for (int clean=0; clean<soaps.length ; clean++) {
	 System.out.println(soaps[clean]) ;
	 }
    for (int clean=soaps.length-1 ; clean>=0 ; clean--) {
	 System.out.println(soaps[clean]);
	 }
}
}