import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert a string :");
		String sentence = input.nextLine();
		System.out.println("Roller Coaster Case sentence :");
		for (int i = 0; i < sentence.length(); i++) {
			if (i % 2 == 0) {
				char letter = Character.toUpperCase(sentence.charAt(i));
				System.out.print(letter);
			} else if (i % 2 != 0) {
				char letter1 = Character.toLowerCase(sentence.charAt(i));
				System.out.print(letter1);
			}
		}
		input.close();

	}

}
