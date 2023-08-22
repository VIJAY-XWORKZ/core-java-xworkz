class AmazonPrimeVideo1
 {

    static String kannadaMovies[] = {"MAJESTIC","NINAGOSKARA","KITTY","KARIYA","LAALI HAADU","NEENADERE ISTA","KUSHALAVE KSHAMAVE","NAMMA PRITHIYA RAMU","LANKESH PATRIKE","ANNAVRU","DHARMA","DARSHAN","BHAGAWAN","KALASIPALYA","SARDARA","AYYA","SHASTRI","SWAMY","MANDYA","SUNTARAGALI","DATTHA","THANGIGAGI","BHOOPATHI","SNEHANA PREETHINA","ANATHARU"};
    static String englishSeries[] = {"BREAKING BAD","CHERNOBYL","GAME OF THRONES","FARGO","SUCCESSION","THE BOYS","ARRESTED DEVELOPMENT","DEXTER","SIX FEET UNDER","THE HAUNTING OF HILL HOUSE","DAREDEVIL","LIMITLESS","WAYNE","HOW I MET U R MOTHER","FREINDS","THE STRANGER","BROKE GIRLS","SHERLOCK","THE PUNISHER","THE FLASH"};
    static String hindiSeries[]   = {"FARZI","THE FAMILY MAN","PANCHAYAT","MIRZAPUR","PAATAL LOK","THE FAMILY MAN 2","THE FARGOTON ARMY","THE LAST HOUR","BANDISH BANDITS","MIRZAPUR 2","BREATH","MADE IN HAEVEN","SPECIAL OPS","GRAHAN","CRIMINAL JUSTICE"};
    static String malayalmMovies[] = {"WITH FIRE AS WITNESS","VISEYAN","RAT TRAP","THE MASTER CARPENTER","VAISHALI","THOOVANATHUMBIKAL","A NORTHERN STORY VALOR","VANAPRASTHAM","SEASON","NAMMKKU","PAITHRUKAM","INNALE","NAALU PENNUNGAL","AMARAM","PADHEYAM","PARINAYAM","JOURNEY","VENKALAM","KAMMATTI PAADAM","MRIGAYA","ORU","SANTHWANAM","THENMAVIN KOMBATH","VATASALYAM","SARGAM"}; 
    static String teluguMovies[] = {"C/O KANCHARARAPALEM","MAYABAZAR","JERSEY","SITA RAMAM","NUVVU NAAKU","AHA NAA PELLANTA","MAHANATI","AGENT","AA NALUGARU","BAAHUBALI 2","BOMMARILLU","SANKRABHARANAM","ATHADU","RANGASTHALAM","PELLI CHOPLU","MANAMADHUDU","MAATHU","KSHNAM","EVARU","DRUSHYAM","ADITHYA","GAMYAM","VEDAM","PRASTHANAM","THOLI PREMA"};
   
   public static void main(String [] args)
 {
  
   System.out.println("main started");
 /* System.out.println("collection of the   kannada movies are");
  System.out.println(kannadaMovies.length);*/
  
   System.out.println("  kannada movies ");
   
	for (int kannada=0;kannada<kannadaMovies.length;kannada++){
  System.out.println(kannadaMovies[kannada]);
	}
	
	System.out.println(" english Series ");
	for (int english=0;english<englishSeries.length;english++){
		System.out.println(englishSeries[english]);
	}
	
	System.out.println("  hindi Series ");
  for (int hindi=0;hindi<hindiSeries.length;hindi++){
		System.out.println(hindiSeries[hindi]);
	}
	
	System.out.println("  telugu Movies ");
	for (int telugu=0;telugu<teluguMovies.length;telugu++){
		System.out.println(teluguMovies[telugu]);
	}
	
	System.out.println("  malayalam movies ");
	for (int malayalam=0;malayalam<malayalmMovies.length;malayalam++){
		System.out.println(malayalmMovies[malayalam]);
	}
     System.out.println("main ended");
  }
 }