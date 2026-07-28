package Tutorial2;
import java.util.Scanner;

public class vowelChecker {

	public static void main(String[] args) {
		// Use switch statements to determine if it's a vowel or a consonant
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter a character: ");
			char ch = scanner.next().charAt(0);
			char chCopy = Character.toLowerCase(ch);
			
			boolean isVowel = false;
			
			switch (chCopy) {
				case 'a': case 'e': case 'i': case 'o': case 'u':
					isVowel = true;
					break;
				default:
					isVowel = false;
					break;
			}
			
			if (isVowel) {
				System.out.println(ch + " is a vowel!");
			}
			else {
				System.out.println(ch + " is NOT a vowel!");
			}
		}

	}

}
