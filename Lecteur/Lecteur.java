import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lecteur {
  
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path chemin = Paths.get("files/file.txt");
		
		for(String line : Files.readAllLines(chemin)) {
			System.out.println(line);
		}
	}
  
}
