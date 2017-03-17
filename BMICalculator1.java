import java.util.Scanner;

public class BMICalculator {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		double inches, pounds, bmi, m, kg;

		System.out.print( "Your height in inches: " );
		inches = keyboard.nextDouble();

		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();

		m = inches / 39.37;
		kg = pounds / 2.20462;

		bmi = kg / (m*m);

		System.out.println( "m = " + m );
		System.out.println( "kg = " + pounds );

		System.out.println( "Your BMI is " + bmi );
	}
}