public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome";
        System.out.println(greeting);
        System.out.println(pluralize(greeting, 1));
    }

    public static String pluralize(String word, int count){
        if (count == 0 || count > 1){
            return word + "s";
        } else {
            return word;
        }
    }
}