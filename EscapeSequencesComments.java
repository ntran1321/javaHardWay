public class EscapeSequencesComments {
	public static void main( String[] args ) {
		//This exercises demos escape sequences and comments
		System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
		System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
		//System.out.frimp( "Learn Java the Hard Way" );
		System.out.print( "Hello\n" );
		/* The quick brown fo jumped over the lazy dog.
			Quick wafting zephyrs vex bold Jim. */
		System.out. /*testing*/ println( "Hard to believe, eh?" );
		System.out.println( "Surprised? /*abcde */ Or what did you expect?");
		System.out.println( "\\// -=- \\//" );
		System.out.println( "\\\\ \\\\ \\\\\\\\"); //it takes 2 to make 1
		System.out.print( "I hope you understand \"escape sequences\" now. \n");
		//and comments. :)

	}
}

//Adding block comment in println DOES NOT compile.