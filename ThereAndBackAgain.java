public class ThereAndBackAgain {
	public static void main( String [] args ) {
		System.out.println("Here.");
		erebor(); //does not compile w/o parenthesis
		System.out.println("Back first time.");
		erebor(); //function does not run or get called when it is omitted
		System.out.println("Back second time.");
	}

	public static void erebor() {
		System.out.println("There.");
	}
}