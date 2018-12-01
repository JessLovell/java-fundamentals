import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Bitmap {
    private Path imagePath;
    private Path outputPath;
    private String transform;
    private BufferedImage imageData;
    BufferedImage img = null;

    public Bitmap (Path imagePath, Path output, String transform) {
        this.imagePath = imagePath;
        this.outputPath = output;
        this.transform = transform;

        try {
            img = ImageIO.read(imagePath.toFile());
            this.imageData = img;
        } catch (IOException e) {
        }
    }

    public void greyscale() {
        //logic on isntance variable
        //take each row
        //add number to make it into the grey color scheme
    }

    // This function will flip the image horizontally!
    public void flipHorizontally() {

        for (int x = 0; x < this.imageData.getWidth(); x++) {
            for (int y = 0; y < this.imageData.getHeight() / 2; y++) {
                int placeholder = this.imageData.getRGB(x, y);
                this.imageData.setRGB(x, y, this.imageData.getRGB(x, this.imageData.getHeight() - y - 1));
                this.imageData.setRGB(x, this.imageData.getHeight() - y - 1, placeholder);
            }
        }
    }

    public void flipVertically() {

        System.out.println(this.imageData.getWidth());
        System.out.println(this.imageData.getHeight());

        for (int i = 0; i < this.imageData.getHeight(); i++){
            for (int j = 0; j < this.imageData.getWidth()/2; j++){
                int placeholder = this.imageData.getRGB(j, j);
                this.imageData.setRGB(j, j, this.imageData.getRGB(j, this.imageData.getWidth() - j - 1));
                this.imageData.setRGB(j, this.imageData.getWidth() - j - 1, placeholder);
            }
        }
    }

    public boolean save() {
        try {
            return ImageIO.write(imageData, "bmp", outputPath.toFile());
        } catch (IOException e){
        }
        return false;
    }
}
