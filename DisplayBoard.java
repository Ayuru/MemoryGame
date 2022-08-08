import java.util.ArrayList;
import java.util.List;

public class DisplayBoard {

	public List<String> Board(List<String> gameBoard, List<String> visibleBoard, int difficulty) {
		spaces.setLength(15);
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.print("Level: ");
		if (gameBoard.size() == easy) {
			System.out.println("easy");
		} else {
			System.out.println("hard");
		}
		System.out.print("Guess chances: " + difficulty);
		System.out.println();
		System.out.println();
		System.out.println("     1" + spaces + "2" + spaces + "3" + spaces + "4");
		System.out.println();
		System.out.print("A    ");
		for (int i = 0; i < 4; i++) {
			System.out.print(visibleBoard.get(i) + spaces.substring(0, 16 - (visibleBoard.get(i).length())));
		}
		System.out.println();
		System.out.println();
		System.out.print("B    ");
		for (int i = 4; i < 8; i++) {
			System.out.print(visibleBoard.get(i) + spaces.substring(0, 16 - (visibleBoard.get(i).length())));
		}
		if (gameBoard.size() != easy) {
			System.out.println();
			System.out.println();
			System.out.print("C    ");
			for (int i = 8; i < 12; i++) {
				System.out.print(visibleBoard.get(i) + spaces.substring(0, 16 - (visibleBoard.get(i).length())));
			}
			System.out.println();
			System.out.println();
			System.out.print("D    ");
			for (int i = 12; i < 16; i++) {
				System.out.print(visibleBoard.get(i) + spaces.substring(0, 16 - (visibleBoard.get(i).length())));
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}

		System.out.println();
		System.out.println();

		return visibleBoard;
	}

	private int width = 80;
	private int easy = 8;
	StringBuilder spaces = new StringBuilder("");
	List<String> visibleBoard = new ArrayList<>();

}
