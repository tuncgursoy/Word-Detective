import java.util.Scanner;
public class wordDetective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardWords words = new CardWords();
		String clues = "", answers = "";
		System.out.println("Blue team:");
		for(int i = 0; i < words.blueTeam.length; i++) {
			System.out.print(words.blueTeam[i] + " ");
		}
		System.out.println();
		System.out.println("Pink team:");
		for(int i = 0; i < words.pinkTeam.length; i++) {
			System.out.print(words.pinkTeam[i] + " ");
		}
	}
		

}
