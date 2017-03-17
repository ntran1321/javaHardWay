import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, breakfast;
		int age;
		double weight, income;
		//define variables so you can store input

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		//Blows up when you put in your full name, it doesn't accept two sets
		//of strings, maybe? Not sure why.

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		//Blows up when you put in letters because it expects an integer

		System.out.println( "So you're " + age + " , eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		//Blows up when you type a string of letters

		System.out.println( weight + "! Wide load!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefuly that is " + income + " per hour" );
		System.out.println(" but you must be broke!" );
		

		System.out.print( "What did you eat for breakfast? " );
		breakfast = keyboard.next();

		System.out.println( breakfast + "?! That's why you weigh five tons! " );

		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );

	}
}

/* Study drills
	1. The program does not blow up when you enter an integer value
	when it expects a double. A double floating value can also be an int.
	2. The proram does not blow up if you enter a numeric value when 
	expecting a String because there can be a string of letters or numbers.
*/