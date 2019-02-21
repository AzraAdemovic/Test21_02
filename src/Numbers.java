import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		 
			Scanner input = new Scanner ( System.in);
			System.out.println("Enter an array length 5 : ");
			int [] niz = new int [5];
			for (int i = 0; i < niz.length; i++) {
				niz [i] = input.nextInt();
			}
			System.out.println("Enter number x :");
			int numberX = input.nextInt();
			for (int i = 0; i < niz.length-1; i++) {
				if (niz[i] + niz[i+1] == numberX) {
					System.out.println("two numbers whitch sum is equals to number " + numberX + " are (  " +  niz[i]+  " ," + niz[i+1] + ")");
				}
			}
			input.close();
		}

	


	}


