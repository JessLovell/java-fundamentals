import java.nio.file.FileSystems;
import java.nio.file.Path;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println("\t" + arg);
        }
        //find a bitmap
        Path imagePath = FileSystems.getDefault().getPath("resources", "MARBLES.bmp");
        Path output = FileSystems.getDefault().getPath("resources", "smiley_after.bmp");

        //read the image
        Bitmap image = new Bitmap(imagePath, output, "something");

        //mess with the image
//        image.flipHorizontally();
//        image.flipVertically();
//        image.invert();
        image.bluescale();

        //output the file
        image.save();
    }
}
