import java.util.ArrayList;
import java.util.List;

public class CreateVisibleBoard {
	public List<String> visibleBoard(int gameBoardSize) {

		for (int i = 0; i < gameBoardSize; i++) {
			visibleBoard.add("X");
		}
		
		
		return visibleBoard;
	}
	
	List<String> visibleBoard = new ArrayList<>();
}
