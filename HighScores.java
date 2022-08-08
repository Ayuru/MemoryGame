import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScores {

	public void SaveScore(String name, String chances, String time, String difficulty, Scanner sc) {
		
		
		try {
	         
	         File file = new File(fileName);
	         if(!file.exists()) {
	            file.createNewFile();
	         }

	         FileWriter fw = new FileWriter(file.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fw);	         
	         bw.write(name + ", ");
	         bw.write(time + " seconds, ");
	         bw.write(chances + " chances, ");
	         bw.write(difficulty + ".");
	         bw.newLine();
	         bw.close();
	         System.out.println("Done saving score");
	      } catch(IOException e){
	         e.printStackTrace();
	      }
	   }

	String fileName = "HighScore.txt";
}
