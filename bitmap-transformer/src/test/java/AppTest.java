/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testBitmap() {

        Path imagePath = FileSystems.getDefault().getPath("resources", "test.bmp");
        Path output = FileSystems.getDefault().getPath("resources", "test_after.bmp");
        Bitmap bit = new Bitmap(imagePath, output, "invert");

        assertTrue("Expect bitmap to have imagePath", bit.imagePath != null);
        assertTrue("Expect bitmap to have imagePath", bit.imagePath == imagePath);
        assertTrue("Expect bitmap to have outputPath", bit.outputPath != null);
        assertTrue("Expect bitmap to have outputPath", bit.outputPath == output);
        assertTrue("Expect bitmap to have transform", bit.transform != null);
        assertTrue("Expect bitmap to have transform", bit.transform == "invert");
        assertTrue("Expect bitmap to have imageData", bit.imageData != null);

    }

    @Test public void testRandomize() {

    }

    @Test public void testFlipHorizontally() {

    }

    @Test public void testFlipVertically() {

    }

    @Test public void testInvert() {

    }

    @Test public void main() {

    }
}
