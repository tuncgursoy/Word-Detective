public class CardWords {
   String [] blueTeam = new String[8];
   String [] pinkTeam = new String[8];
   
   public void createBlueTeam() {
	   for(int i = 0; i < blueTeam.length; i++) {
		   Dictionary dict = new Dictionary();
		   String randomWrd = dict.randomWord;
		   blueTeam[i] = randomWrd;
	   }
   }
   
   public void createPinkTeam() {
	   for(int i = 0; i < pinkTeam.length; i++) {
		   Dictionary dict = new Dictionary();
		   String randomWrd = dict.randomWord;
		   pinkTeam[i] = randomWrd;
	   }
   }
   
   public CardWords () {
	   createPinkTeam();
	   createBlueTeam();
   }
}

