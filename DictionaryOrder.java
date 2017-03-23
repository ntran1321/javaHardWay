import java.util.Scanner; //ex. 23

public class DictionaryOrder {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String name;

		System.out.print( "Make up the name of a programming language! " );
		name = keyboard.nextLine();
		//nextline reads everything including spaces and tabs
		//next() only reads on string and ignores after spaces

		if ( name.compareToIgnoreCase("c++") < 0 ) //to compare strings use compareTO function
			System.out.println( name + " comes BEFORE c++" );
		if ( name.compareToIgnoreCase("c++") == 0 )
			System.out.println( "c++ isn't a made up language!" );
		if ( name.compareToIgnoreCase("c++") > 0 )
			System.out.println( name + " comes AFTER c++" );

		if ( name.compareToIgnoreCase("go") < 0 )
			System.out.println( name + " comes BEFORE go" );
		if ( name.compareToIgnoreCase("go") == 0 )
			System.out.println( "go isn't a made up language!" );
		if ( name.compareToIgnoreCase("go") > 0 )
			System.out.println( name + " comes AFTER go" );

		if ( name.compareToIgnoreCase("java") < 0 )
			System.out.println( name + " comes BEFORE java" );
		if ( name.compareToIgnoreCase("java") == 0 )
			System.out.println( name + " isn't a made up language!" );
		if ( name.compareToIgnoreCase("java") > 0 )
			System.out.println( name + " comes AFTER java" );
	}
}