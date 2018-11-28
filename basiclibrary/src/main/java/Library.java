import java.util.Arrays;
import java.util.Random;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int rolls) {
        int[] arr = new int[rolls];
        Random rand = new Random();

        for (int i = 0; i < rolls; i++){
            arr[i] = rand.nextInt(6) + 1;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static boolean containsDuplicates(int[] arr) {

        for (int item : arr){
            for (int i = 0; i < arr.length; i++){
                if (item == arr[i]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int calculateAverage(int[] arr){

        int total = 0;
        for (int item : arr) {
            total += item;
        }
        return total/arr.length;
    }

    public static int calculateArrAverage(int[][] arr){

        int lowest = calculateAverage(arr[0]);
        int average = 0;

        for (int[] item : arr){
            average = calculateAverage(item);
            if (average < lowest) {
                lowest = average;
            }
        }
        return lowest;
    }
}
