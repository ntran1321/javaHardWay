public class MathOperations {
	public static void main( String[] args ) {
		int a, b, c, d, h, f, g, p, r, t, j, l, k; //can variables be upper case?
		//got rid of original e variable
		double x, y, z, e;
		String one, two, both;

		a = 10;
		b = 27;
		System.out.println( "a is " + a + " , b is " + b );

		c = a + b;
		System.out.println( "a+b is " + c );
		d = a - b; 
		System.out.println( "a-b is " + d );
		h = a+b*3;
		System.out.println( "a+b*3 is " + h );
		f = b/2; 
		System.out.println( "b/d is " + f );
		g = b % 10;
		System.out.println( "b%10 is " + g );

		x = 1.1;
		System.out.println( "\nx is " + x );
		y = x*x;
		System.out.println( "x*x is " + y );
		z = b / 2;
		System.out.println( "b/2 is " + z );
		System.out.println();

		one = "dog";
		two = "house";
		both = one + two;
		System.out.println( both );

		p = 6000;
		e = 2.71828;
		r = .12;
		t = 40;
		j = r*t;
		k = Math.pow(e,j);
		l = p*k;
		//Why doesn't Java have an exponent operator?!?!

		System.out.println("The amount of money I will have when I retire is: $" + a );

		//giving up for now, I'm making too many errors.
	}


}