import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome";
        System.out.println(greeting);

        System.out.println("pluralize: "+ pluralize(greeting, 0));
        System.out.println("pluralize: "+ pluralize(greeting, 1));
        System.out.println("pluralize: "+ pluralize(greeting, 2));

        flipNHeads(4);
    }

    public static String pluralize(String word, int count){
        if (count == 0 || count > 1){
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads(int nHeads){
        int i = 0;
        int flips = 0;
        float placeholder = 0;

        while (i < nHeads){
            Random rand = new Random();
            float n = rand.nextFloat();

            if (i == 0){
                placeholder = n;
            }

            if (n < 0.5){
                System.out.println("flip "+ flips + ": tails");
                flips++;
                placeholder = n;
                i = 0;
            } else if (n >= 0.5 && placeholder >= 0.5){
                System.out.println("flip "+ flips + ": heads");
                placeholder = n;
                flips++;
                i++;
            } else {
                flips++;
            }
        }
        System.out.println("It took " + flips + " flips to get " + nHeads + " in a row.");
    }
}