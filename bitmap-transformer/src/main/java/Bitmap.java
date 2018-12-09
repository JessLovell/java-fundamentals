import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;

public class Bitmap {
    protected Path imagePath;
    protected Path outputPath;
    protected String transform;
    protected BufferedImage imageData;
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

    public void randomize() {
        for (int i = 0; i < this.imageData.getHeight(); i++) {
            for (int j = 0; j < this.imageData.getWidth(); j++){
                Random rand = new Random();
                int newX = rand.nextInt(this.imageData.getHeight() - 1);
                int newY = rand.nextInt(this.imageData.getWidth() -1);
                int newRGB = this.imageData.getRGB(newY, newX);
                this.imageData.setRGB(j ,i, newRGB);
            }
        }
    }

    public void flipHorizontally() {

        for (int i = 0; i < this.imageData.getWidth(); i++) {
            for (int j = 0; j < this.imageData.getHeight() / 2; j++) {
                int placeholder = this.imageData.getRGB(i, j);
                this.imageData.setRGB(i, j, this.imageData.getRGB(i, this.imageData.getHeight() - j - 1));
                this.imageData.setRGB(i, this.imageData.getHeight() - j - 1, placeholder);
            }
        }
    }

    public void flipVertically() {

        for (int i = 0; i < this.imageData.getHeight(); i++){
            for (int j = 0; j < this.imageData.getWidth() / 2; j++){
                int placeholder = this.imageData.getRGB(j, i);
                this.imageData.setRGB(j, i, this.imageData.getRGB(this.imageData.getWidth() - j - 1, i));
                this.imageData.setRGB(this.imageData.getWidth() - j - 1, i, placeholder);
            }
        }
    }

    public void invert(){
        for (int i = 0; i < this.imageData.getHeight(); i++){
            for (int j = 0; j < this.imageData.getWidth(); j++){
                int invert = 0xFFFFFF - this.imageData.getRGB(j, i);
                this.imageData.setRGB(j, i, invert);
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
