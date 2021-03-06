import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {

    }

    public static int linter(Path file) {

        int counter = 0;
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)){
            String line = "";
            int lineNum = 0;
            while(line != null) {
                if (!line.isEmpty() && !line.endsWith("{") && !line.endsWith("}") &&
                        !line.contains("if") && !line.contains("else") &&
                        !line.contains("//") && !line.contains(";")) {
                    System.out.println("Line " + lineNum + ": Missing semicolon.");
                    counter++;
                }
                lineNum++;
                line = reader.readLine();
            }
        }
        catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return counter;
    }
}
