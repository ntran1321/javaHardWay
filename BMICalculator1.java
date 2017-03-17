import java.util.Scanner;

public class BMICalculator1 {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		double feet, inches1, inches, pounds, bmi, m, kg;

		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();

		System.out.print( "Your height (inches): " );
		inches = keyboard.nextDouble();

		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();

		inches1 = feet * 12;
		m = (inches1 + inches) / 39.37;
		kg = pounds / 2.20462;

		bmi = kg / (m*m);

		System.out.println( "m = " + m );
		System.out.println( "kg = " + pounds );

		System.out.println( "Your BMI is " + bmi );
	}
}