import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String answer;
		double x, y;

		System.out.print( "Give me a number, and I'll find its square root." );
		System.out.print( "\nAre you ready?! " );
		answer = keyboard.next();

		while ( !answer.equals("YES!")) {
			System.out.println("Wrong answer! Are you ready?!");
			answer = keyboard.next();
		}

		System.out.print( "(No negatives, please): " );
		x = keyboard.nextDouble();

		while ( x < 0 ) {
			System.out.println("I won't take sq root of negative." );
			System.out.print("\nNew number: " );
			x = keyboard.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("The sq root of " + x + " is " + y );
	}
}