import java.util.Scanner;

public class PigDice {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int roll, ptot, ctot, turnTotal;
		String choice = "";

		ptot = 0;
		ctot = 0;

		do {
			turnTotal = 0;
			System.out.println( "You have " + ptot + " points." );

			do {
				roll = 1 + (int)(Math.random()*6);
				System.out.println( "\tYou rolled a " + roll + "." );
				if ( roll == 1 ) {
					System.out.println( "\tThat ends your turn." );
					turnTotal = 0;
				}
				else {
					turnTotal += roll;
					System.out.print( "\tYou have " + turnTotal + " pts." );
					System.out.print( "\tWould you like to \"roll\" again");
					System.out.print( " or \"hold\"" );
					choice = keyboard.next();
				}
			} while ( roll != 1 && choice.equals("roll") );

			ptot += turnTotal;
			System.out.println( "\tYou end the round with " + ptot + " points.");

			if ( ptot < 100 ) {
				turnTotal = 0;
				System.out.println("\tComp has " + ctot + " pts." );

			do {
				roll = 1 + (int)(Math.random()*6);
				System.out.println( "Computer rolled a " + roll + "." );
				if ( roll == 1 ) {
				System.out.println( "\tThat ends its turn." );
				ctot = 0;
				}
				else {
				ctot +=  roll;
				System.out.print( "\tComputer has " + ctot );
				System.out.print( " points so far this round.\n" );
				if ( ctot < 24 ) {
					System.out.println( "\tComputer will roll again." );
				}
			}
		} while ( roll != 1 && (ctot < 20 || ctot + turnTotal !> 100) );
		//not sure if this really makes the comp's turn stop when it earns
		//enough points to win

		ctot += turnTotal;
		System.out.print( "\tComp ends the round with " );
		System.out.print( ctot + " points. \n" );
		}
	} while (ptot < 100 && ctot < 100);

	if ( ptot > ctot ) {
		System.out.println( "Humanity wins!" );
		}
	else {
		System.out.println( "The computer wins." );
		}
	}
}