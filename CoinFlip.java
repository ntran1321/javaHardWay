import java.util.Scanner;

public class CoinFlip {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String coin, again = 0;
		int streak = 0;
		boolean gotHeads;


			gotHeads = Math.random() < .5;

			if ( gotHeads )
				coin = "Heads";
			else 
				coin = "Tails";

			System.out.println( " You flip a coin and it's..." + coin );

			if ( gotHeads ) {
				streak++;
				System.out.println("\tThat's " + streak + " in a row...." );
				System.out.print("\tWould you like to flip again (y/n)? " );
				again = keyboard.next();
			}
			else {
				System.out.println("\tYou lose your soul!");
				System.out.println("\tShould've quit while you were aHEAD...");
				streak = 0;
				again = "n";
			}
		} 

		while ( again.equals("y") );

		System.out.println( "Final score: " + streak );
	}
}

//the while loop is a pre-test loop
//do-while is post test bc it checks condition afterward