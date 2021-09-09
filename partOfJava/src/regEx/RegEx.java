package regEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {

	public static void checkNumberA() {
		Pattern pattern = Pattern.compile("\\d{3}.\\d{2}.\\d{2}");
		System.out.println("Input phone number A");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		System.out.println(Pattern.matches(String.valueOf(pattern), num));
	}

	//	has to ve changed
	public static void checkNumberB() {
		Pattern pattern = Pattern.compile("\\d .\\d{3}. \\d{3}.\\d{2}.\\d{2}");
		System.out.println("Input phone number B");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		System.out.println(Pattern.matches(String.valueOf(pattern), num));
	}

	public static void checkNumberC() {
		Pattern pattern = Pattern.compile(".\\d{3}.\\d{2}.\\d{3}.\\d{2}.\\d{2}");
		System.out.println("Input phone number C");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		System.out.println(Pattern.matches(String.valueOf(pattern), num));
	}


}
