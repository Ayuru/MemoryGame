import java.util.List;
import java.util.Scanner;

public class MemoryGameByAyu {

	public static void main(String[] args) {

		FileOperation file = new FileOperation();
		file.ReadfromFile(fileLocation);

		String toRestart;
		boolean restart = true;
		Scanner sc = new Scanner(System.in);

		while (restart) {
			DifficultyEntry difficulty = new DifficultyEntry();
			difficulty.PickDifficulty(sc);

			Randomizer rand = new Randomizer();
			String[] tableOfWords = rand.PickWords(file.listOfWords, difficulty.numberOfWords);

			List<String> gameBoard = rand.CreateGame(tableOfWords, difficulty.numberOfWords);

			CreateVisibleBoard visibleBoard = new CreateVisibleBoard();
			List<String> vb = visibleBoard.visibleBoard(gameBoard.size());

			GameLogic game = new GameLogic();
			String[] scoresTable = game.Game(gameBoard, vb, difficulty.numberOfChances, sc);
			scoresTable[0] = "";
			System.out.println("Thanks for playing!");
			System.out.println();

			if (scoresTable[0].equals("true")) {
				HighScores scores = new HighScores();
				scores.SaveScore(difficulty.name, scoresTable[1], scoresTable[2], scoresTable[3], sc);
			}
			sc.nextLine();
			System.out.println("If you want to play again, enter 1.");
			toRestart = sc.nextLine();
			if (!toRestart.equals("1")) {
				restart = false;
			}

		}

		sc.close();

	}

	private static String fileLocation = "Words.txt";
}
