import java.util.Scanner;

public class AgeMessages {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "You are: " );
		if ( age < 13 ) {
			System.out.println( "\ttoo young to create a FB account" );
		}
		if ( age >= 13) {
			System.out.println( "\told enough to create a FB account" );
		}
		if ( age < 16 ) {
			System.out.println( "\ttoo young to drive" );
		}
		if ( age >= 16) {
			System.out.println( "\told enough to drive" );
		}
		if ( age < 18 ) {
			System.out.println( "\ttoo young to get a tattoo" );
		}
		if ( age >= 18) {
			System.out.println( "\told enough to to get a tattoo" );
		}
		if ( age < 21 ) {
			System.out.println( "\ttoo young to drink alochol" );
		}
		if ( age < 35 ) {
			System.out.println( "\ttoo young to run for President" );
		}
		if ( age >= 35 && age < 65 ) {
			System.out.println( "\t#work,work,work,work" );
		}
		if ( age >= 65 ) {
			System.out.println( "\tgoing to buy that RV and retire!" );
		}
	}
}

/*if you type an age > 35, no message gets printed because there is no condition set
	up for age > 35 
	*/
