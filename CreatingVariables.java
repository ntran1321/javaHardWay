public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, weight;
		double pi;
		String lastName, title, house, aka;

		x = 20;
		y = 400;
		age = 25;
		weight = 120;

		pi = 3.14159265;

		lastName = "Daenerys";
		title = "Queen";
		house = "Targaryen";
		aka = "Mother of Dragons";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y.");
		System.out.println( "I am " + age + " years old");
		System.out.println( "I weigh " + weight + " lbs");
		System.out.println( "My favorite irrational # is pi! " + pi );
		System.out.println( "The ruler of the 7 kingdoms is " + title + " " + lastName + " of House " + house);
		System.out.println( "Also known as the " + aka);

	}
}