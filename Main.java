// PARTNER NAME: Alyssa Pupping
// PARTNER NAME: N/A
// CS111 SECTION #: 1.2
// DATE: 3/25/25

public class Main
{
	public static void main(String[] args)
	{

		// CONSTANTS SECTION 
		
		final String ANSI_BG_RED = "\u001B[41m";
		final String ANSI_BG_BLUE = "\u001B[44m";
		final String ANSI_BOLD = "\u001B[1m";
		final String ANSI_RESET = "\u001B[0m";
		final String TITLE_USA = ANSI_BG_RED + ANSI_BOLD + "UNITED STATES OF AMERICA" + ANSI_RESET;
		final String SUBTITLE_AUTH = ANSI_BG_BLUE + ANSI_BOLD + "EMPLOYMENT AUTHORIZATION CARD" + ANSI_RESET;

		//DECLARATION + INITIALIZATION SECTION

		String surname, givenName, category, cardNum, birthCountry, termsAndConditions; 
		char sex;

		String birthMonth;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay, validMonth, validYear, expireMonth, expireDay, expireYear;

		//INPUT SECTION

		surname = "Eide";
		givenName = "Clara";
		category = "A01";
		cardNum = "ABC123456";
		birthCountry = "Norway";
		termsAndConditions = "None";
		sex = 'F';
		birthMonth = "DEC";
		uscisNum1 = 123;
		uscisNum2 = 456;
		uscisNum3 = 789;
		birthDay = 10;
		birthYear = 2002; 
		validDay = 25;
		validMonth = 3;
		validYear = 2025;
		expireDay = 25;
		expireMonth = 3; 
		expireYear = 2030;



		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         " + TITLE_USA + " ");
		System.out.println("║                                  " + SUBTITLE_AUTH + " ");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName +  " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3 + "    " + category + "        " + cardNum + "");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + birthCountry + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsAndConditions + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + birthMonth + " " + birthDay + " " + birthYear + "     " + sex + "");
		System.out.println("║                       Valid From:     " + validMonth + "/" + validDay + "/" + validYear + "");
		System.out.println("║                       Card Expires:   " + expireMonth + "/" + expireDay + "/" + expireYear + "");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}