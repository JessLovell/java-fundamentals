/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {

        Bitmap image = new Bitmap(args[0], args[1], args[2]);

        for (String arg : args) {
            System.out.println("\t" + arg);
        }
    }
}
