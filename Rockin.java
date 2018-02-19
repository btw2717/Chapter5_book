import java.util.Scanner;
import java.util.Random;

public class Rockin {
	public static int userDraw = 4;
	public static int userWins = 0;
	public static int compWins = 0;
	public static void main(String[] args) {
		String CompDrawstring;
		String userDrawstring;
		
		Scanner keyboard = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.println("Scissors(0)  Rock(1)  Paper(2)");
		System.out.println("Choose one and enter it in. When you press enter, I will also choose randomly and we will see who wins....\n if you're done enter 3 ");

		while((compWins < 2) && (userWins < 2)) {
		
			int compDraw = rand.nextInt(3);
			//System.out.println("My draw is: " + compDraw);
			//System.out.println();
			System.out.println("Enter your number: ");
			userDraw = keyboard.nextInt();
			System.out.println();
			
			if(userDraw == 0) {
				if(compDraw == 2) {
					System.out.println("You had Scissors which beats my paper..");
					++userWins;
				}else if(compDraw == 1) {
					System.out.println("I have Rock and that beats scissors");
					++compWins;
				}else {
					System.out.println("We both threw scissors, it's a tie");
				}
			}else if(userDraw == 1) {
				if(compDraw == 2) {
					System.out.println("I beat your Rock with paper");
					++compWins;
				}else if(compDraw == 1) {
					System.out.println("Tie, we both threw Rock");
				}else {
					System.out.println("Your Rock beats my scissors");
					++userWins;
				}

			}else if(userDraw == 2) {
				if(compDraw == 0) {
					System.out.println("My scissors beats your paper");
					++compWins;
				}else if(compDraw == 1) {
					System.out.println("Your paper beats my Rock!");
					++userWins;
				}else {
					System.out.println("Paper tie!");
				}

			}else if(userDraw == 3) {
				System.out.println("Time to go");
				keyboard.close();
				System.exit(0);
			}else if((userDraw != 0) || (userDraw != 1) || (userDraw != 2)) {
				System.out.println("Wrong input");
			}
			
			if(userWins == 2) {
				if(compWins == 0) {
					System.out.println("Ugh, you crushed me 2 to 0");
				}else if(compWins == 1) {
					System.out.println("You got me, 2 to 1");
				}
			}
			if(compWins == 2) {
				if(userWins == 0) {
					System.out.println("I crushed you! 2 to 0!");
				}else if(userWins == 1) {
					System.out.println("I got you, 2 to 1");
				}

			}
		}
	}
}
