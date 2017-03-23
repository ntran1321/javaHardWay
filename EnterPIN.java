import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String password, entry1;
		int pin, entry2;

		password = "herrow";
		pin = 12345;

		System.out.println( "WELCOME TO THE BANK OF JAVA.");

		System.out.print( "ENTER YOUR PASSWORD: ");
		entry1 = keyboard.next();


		while ( ! entry1.equals("herrow")) {
			System.out.println("\nINCORRECT. TRY AGAIN.");
			System.out.print( "ENTER YOUR PASSWORD: ");
			entry1 = keyboard.next();
		}

		System.out.print("\nPASSWORD ACCEPTED. NOW ENTER PIN: ");
		entry2 = keyboard.nextInt();

		while ( entry2 != pin ) {
			System.out.println("\nINCORRECT. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry2 = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCT BAL IS $424,320.00");
	}
}