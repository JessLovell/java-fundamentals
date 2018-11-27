import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome";

        System.out.println("pluralize: "+ pluralize(greeting, 0));
        System.out.println("pluralize: "+ pluralize(greeting, 1));
        System.out.println("pluralize: "+ pluralize(greeting, 2));

        // flipNHeads(4);
        clock();
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

    public static void clock(){
        // LocalDateTime now = LocalDateTime.now();
        // String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        // int nanoSecond = now.getNano();
  
        // System.out.println(nanoSecond);
        // System.out.println(now);
        // System.out.println(time);
        int i = 0;
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        int second = now.getSecond();
        int placeholder = second - 1;

        while (i < 1){
            now = LocalDateTime.now();
            time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            second = now.getSecond();
            
            if (second - placeholder == 1){
                // System.out.println(Second);
                // System.out.println(now);
                System.out.println(time);
                placeholder = second;
                
            } 
        }
    }
}