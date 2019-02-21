import java.util.Scanner;

public class NotDuble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert a sentence: ");
		String sentence = input.nextLine();
		for (int i = 0; i < sentence.length(); i++) {
			int letter = 0;
			for (int j = 0; j < sentence.length(); j++) {
				if (sentence.charAt(i) == sentence.charAt(j)) {
					letter++;
				}
			}
			if (letter == 1) {
				System.out.println("Letter whitch is unique in sentence is " + sentence.charAt(i) + " .");
				break;
			}
		}
		input.close();

	}

}
