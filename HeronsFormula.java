public class HeronsFormula {
	public static void main( String[] args ) {
		double a, g;
		String tws = "A triangle with sides";

		a = triangleArea(3,3,3);
		System.out.println("A triangle with sides 3,3,3 has area " + a);

		a = triangleArea(3,4,5);
		System.out.println("A triangle with sides 3,4,5 has area "+ a);

		g = triangleArea(7,8,9);
		System.out.println(tws + "7,8,9 has area" + g);

		g = triangleArea(9,9,9);
		System.out.println(tws + "9,9,9 has area " + g);

		System.out.println(tws + "5,12,13 has area " + triangleArea(5,12,13) );
	}

	public static double triangleArea( int a, int b, int c ) {
		double s, A;

		s = (a+b+c)/2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c));

		return A;
	}
}

//1. the version that does not use a function is longer because the 
//triangArea function has to be typed multiple times, also variables
//have to be redefined multiple times

