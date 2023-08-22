class SportsMania
{

   static String topTenCricketBatsMan[] = {"VIRAT KOHLI","ROHITH SHARMA","SHIKAR DAVAN","RISHAB PANT","AJINKEYA RAHANE","ABD","FOF","MAXWELL","KANE WILLIAMSON","WARNER"};
   static String topTenCricketBowler[] ={"CHAHAL","JADESJA","STARC","BHUVANESHWAR KUMAR","BOULT","STAIN","RABADA","LASITH MALINGA","SHAMI","HARSHAL PATEL"};
   static String topTenHockyTeam[] ={"AUSTRALIA","BELGIUM","NETHERLANDS","GERMANY","INDIA","ENGLAND","ARGENTINA","SPAIN","NEW ZEALAND","MALAYSIA"};
   static String topTenTennisPlayer[] ={"NOVAK DJOKOVIC","CARLOS ALCARAZ","DANIIL MEDEVEDEV","RAFAEL NADAL","JANNIK SINNER","CASPER RUUD","STEFFANOS TSITSIPAS","FELIX","ANDREY RUBLEV","FRANCES TIAFOE"};
   static String topTenCricketTeams[] ={"INDIA","AUSTRALIA","ENGLAND","NEW ZEALAND","SRILANKA","BANGLADESH","WESTINDIES","PAKISTHAN","SOUTH AFRICA","NETHERLANDS"};
  
  public static void main(String [] args)
 {
  
  System.out.println("main started");
  
   System.out.println("TOP TEN CRICKET BATSMANS");
   
   for (int batsman=9; batsman>=0; batsman--){
   System.out.println(topTenCricketBatsMan[batsman]);
   }
   
  
   
   System.out.println("TOP TEN CRICKET BOWLERS");
   for (int bowler=9;bowler>=0;bowler--){
   System.out.println(topTenCricketBowler[bowler]);
   }
   
   
  
 
  System.out.println("TOP TEN HOCKY TEAM");
  for (int team=9; team>=0; team--){
  System.out.println(topTenHockyTeam[team]);
  }
 
  
  
  System.out.println("TOP TEN TENNIS PLAYERS");
  for (int player=9; player>=0; player--){
  System.out.println(topTenTennisPlayer[player]);
  }
 
   
   System.out.println("TOP TEN CRICKET TEAMS");
   for (int cricket=9 ;cricket>=0 ;cricket--){
   System.out.println(topTenCricketTeams[cricket]);
   }
 
  
  
  
    System.out.println("main ended");
 }
}