public class CardWords {
   static String [] blueTeam = new String[12];
   static String [] pinkTeam = new String[12];
   String temp = "";

   public void createBlueTeam() {
	   for(int i = 0; i < blueTeam.length; i++) {
		   Dictionary dict = new Dictionary();
		   String randomWrd = dict.randomWord;
		   	if(randomWrd.equals(temp)) {
				Dictionary dict2 = new Dictionary();
				randomWrd = dict2.randomWord;
			}
		   blueTeam[i] = randomWrd;
		   temp = randomWrd;
	   }
   }
   
   public void createPinkTeam() {
	   for(int i = 0; i < pinkTeam.length; i++) {
		   Dictionary dict = new Dictionary();
		   String randomWrd = dict.randomWord;
			   if(randomWrd.equals(temp)) {
				   Dictionary dict2 = new Dictionary();
				   randomWrd = dict2.randomWord;
			   }
		   pinkTeam[i] = randomWrd;
		   temp = randomWrd;
	   }
   }
   
   public CardWords () {
	   createPinkTeam();
	   createBlueTeam();
	   for(int i = 0; i < 12; i++) {
	   		String a = pinkTeam[i];
	   		String b;
	   		for(int x = 0; x < 12; x++) {
	   		b = blueTeam[x];
	   			if(a.equals(b)){
	   				Dictionary dict3 = new Dictionary();
	   				blueTeam[x] = dict3.randomWord();
				}
			}
	   }
   }
}

