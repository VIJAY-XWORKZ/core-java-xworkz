class SuperMarket1 {
	 static String chocalates[] ={"munch","dark chocalate","candyman","kitkate","dairy milk","milky bar","perk","5 star","ferror rocher","melody","sneakers","kinder","coffee bite","bounty","hersheys"};
	 static String biscuits[] ={"bourbon","good day","britannia","parle g","patanjali","mari gold","50-50","chaska maska","oreo","sunfeast ","chocalate cram biscuit","fab","momos magic","","lemon puff"};
	 static String perfumes[] ={"yardley","engage","denver","vanderbilt","rahil","angelo","fog","black opium","miss dior","secret","chocoe","born wild","gucci","mixed emotions","versace"};
	 static String fruits[] ={"kiwi","jackfruit","pineapple","papaya","gooseberry","apple","mango","orange","grapes","cherry","strawberry","pomegranate","coconu","pear","banana"};
	 static String vegetables[] ={"beetroot","beans","potato","radish","lady's finger","tomato","onion","spinach","carrot","peas","broccoli","pumpkin","mushroom","capsicum","drumstick"};
	 static String snacks[] ={"candies","brownies","puffcorn","crackers","namkeen","lays","kurkure","cake","bread","popcorn","mixture","moongdal","corn snacks","gems","orbit"};
	 static String groceries[] ={"pasta","maggie","yipee","corn flour","pepper powder","rice","wheat flour","ragi flour","egg","chilli powder","chicken masala","mutton masala","meat","butter","cooking oil"};
	 static String iceCream[] ={"mint chocalate chip","buttered pecan","cookie dough","black current","venilla","cookie n cream","neapolitan","pistachio","rocky load","butter pecan","coffee pudge","pranline and cream","salted caramel","almond ","sundae"};
	 static String softDrinks[] ={"7up","artos","soda","power drink","sunkist","pepsi ","coke","merinda","fanta","sprite","unhealthyza","limda","frooti","slice","tizer"};
	 static String soaps[] ={"dove","lux","dettol","lifebuoy","himalaya","medimix","cinthol","santoor","pears","arasan","rin","vim","mysore sandal","hamam","nivea"};
	
	public static void main (String args[]) {
		 getChocalates();
		 getBiscuits();
		 getPerfumes();
		 getFruits();
		 getVegetables();
		 getSnacks();
		 getGroceries();
		 getIceCream();
		 getSoftDrinks();
		 getSoaps();
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
    for (int soft=0; soft<softDrinks.length ; soft++) {
	 System.out.println(softDrinks[soft]) ;
	 }
    for (int soft=softDrinks.length-1 ; soft>=0 ; soft--) {
	 System.out.println(softDrinks[soft]);
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