import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lignes = Files.readAllLines(Path.of("questions.txt"));
        for (String ligne : lignes) {
            System.out.println(ligne);
        }
	lignes.size()
    }
}