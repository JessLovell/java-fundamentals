import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Bitmap {
    private String input;
    private String output;
    private String transform;
    private BufferedImage imageData;
    BufferedImage img = null;

    public Bitmap (String input, String output, String transform) {
        this.input = input;
        this.output = output;
        this.transform = transform;

        try {
            img = ImageIO.read(new File(input));
            this.imageData = img;
        } catch (IOException e) {
        }
    }

    public boolean save (String savePath) {
        try {
            ImageIO.write(NEEDS_TO_GO_IN_HERE);
        } catch (IOException e){
        }
    }

}
