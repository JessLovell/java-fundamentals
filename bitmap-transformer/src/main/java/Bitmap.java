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
    BufferedImage img = null;

    public Bitmap(String input, String output, String transform) {
        this.input = input;
        this.output = output;
        this.transform = transform;

        try {
            img = ImageIO.read(new File(input));
            System.out.println(img);

            int black = 0;
            int other = 0;
            for (int x = 0; x < img.getHeight(); x++){
                for (int y = 0; y < img.getWidth(); y++){
                    int color = img.getRGB(y, x);
                    if (color == Color.BLACK.getRGB()){
                        black++;
                    }
                    else {

                        other++;
                    }
                }
            }
            System.out.println(black);
            System.out.println(other);
        } catch (IOException e) {

        }

    }

}
