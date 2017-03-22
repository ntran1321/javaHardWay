public class ClubBouncer {
	public static void main ( String[] args ) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
			System.out.println("You are allowed to enter the club.");
		}
		else {
			System.out.println("You shall not pass.");
		}
	}
}

//adding a println() statement between lines 10 and 11 does NOT compile
//java sees an error because the else has to be after the if
