import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameLogic {

	public String[] Game(List<String> gameBoard, List<String> visibleBoard, int numberOfChances, Scanner sc) {
		System.out.println("Lets GO!!!");
		int tempChances = numberOfChances;
		start = System.nanoTime();
		while (tempChances > 0 && !gameBoard.equals(visibleBoard)) {
			List<String> ephemeralBoard = new ArrayList<>(visibleBoard);			
			DisplayBoard board = new DisplayBoard();
			board.Board(gameBoard, ephemeralBoard, tempChances);
			System.out.println();
			sc.nextLine();
			try {
			System.out.println("Enter first coordinate:");
			String first = sc.nextLine();
			String firstLetter = first.substring(0, 1);
			if (firstLetter.equalsIgnoreCase("A")) {
				first1 = -1;
			}
			if (firstLetter.equalsIgnoreCase("B")) {
				first1 = 3;
			}
			if (firstLetter.equalsIgnoreCase("C")) {
				first1 = 7;
			}
			if (firstLetter.equalsIgnoreCase("D")) {
				first1 = 11;
			}
			String first2b = first.substring(1);
			int first2 = Integer.parseInt(first2b);
			ephemeralBoard.set((first1 + first2), gameBoard.get(first1 + first2));
			board.Board(gameBoard, ephemeralBoard, tempChances);
			System.out.println("Enter second coordinate:");
			String second = sc.nextLine();
			System.out.println("You've picked " + second);
			String secondLetter = second.substring(0, 1);
			if (secondLetter.equalsIgnoreCase("A")) {
				second1 = -1;
			}
			if (secondLetter.equalsIgnoreCase("B")) {
				second1 = 3;
			}
			if (secondLetter.equalsIgnoreCase("C")) {
				second1 = 7;
			}
			if (secondLetter.equalsIgnoreCase("D")) {
				second1 = 11;
			}
			String second2b = second.substring(1);
			int second2 = Integer.parseInt(second2b);
			
			ephemeralBoard.set((second1 + second2), gameBoard.get(second1 + second2));
			board.Board(gameBoard, ephemeralBoard, tempChances);

			if (ephemeralBoard.get(second1 + second2).equals(ephemeralBoard.get(first1 + first2))
					&& !first.equals(second)) {
				visibleBoard = List.copyOf(ephemeralBoard);
			}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Wrong input! One chance lost!");
			} catch (NumberFormatException f) {
				System.out.println("Wrong input! One chance lost!");
			}
			if (gameBoard.equals(visibleBoard)) {
				System.out.println();
				finish = System.nanoTime();
				time = (finish - start)/1000000000;
				scoresTable[0] = "true";
				System.out.println("Congratulations! You have won!");
				System.out.println(
						"You solved the memory game after " + (numberOfChances - tempChances) + " chances. It took you " + time +" seconds");

			} else {
				tempChances--;
			}

			System.out.println("Press enter to continue");
			try {
				System.in.read();
			} catch (Exception e) {
			}

		}
		scoresTable[1] = String.valueOf(numberOfChances - tempChances);
		scoresTable[2] = String.valueOf(time);
		if (numberOfChances == 10) {
			scoresTable[3] = "EASY";
		} else {
			scoresTable[3] = "HARD";
		}
		
		return scoresTable;

	}
	
	private int first1;
	private int second1;
	private long start;
	private long finish;
	private long time;
	String[] scoresTable = new String[4];
	


}
