import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Randomizer {

	public String[] PickWords(List<String> listOfWords, int difficulty) {		
		String[] tab = new String[difficulty];

		for (int i = 0; i < difficulty; i++) {
			tab[i] = listOfWords.get(rand.nextInt(listOfWords.size()));

			for (int j = 0; j < i; j++) {
				while (tab[i].equals(tab[j])) {
					tab[i] = listOfWords.get(rand.nextInt(listOfWords.size()));
				}
			}

		}

		return tab;
	}

	public List<String> CreateGame(String tabOfWords[], int difficulty) {
		for (int i = 0; i < difficulty; i++) {
		gameBoard.add(tabOfWords[i]);
		gameBoard.add(tabOfWords[i]);
		}
		Collections.shuffle(gameBoard);
		
		return gameBoard;
		
	}
	List<String> gameBoard= new ArrayList<>();
	private Random rand = new Random();
}
