import java.util.InputMismatchException;
import java.util.Scanner;

public class DifficultyEntry {

	public void PickDifficulty(Scanner sc) {
		try {
		while (check) {

			System.out.println("Enter '1' for Easy, '2' for Hard");


			pick = sc.nextInt();

				if (pick == 1 || pick == 2) {
					check = false;
				} else {
					System.out.println("Wrong number!!!");
				}

		}
		} catch (InputMismatchException e) {
			System.out.println("Wrong input format!!!");
		}
		if (pick == 1) {
			numberOfWords = 4;
			numberOfChances = 10;
		}
		if (pick == 2) {
			numberOfWords = 8;
			numberOfChances = 15;
		}

	}

	int pick;
	int numberOfWords;
	int numberOfChances;
	boolean check = true;
}
