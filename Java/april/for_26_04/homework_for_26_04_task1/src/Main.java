public class Main {
    public static void main(String[] args) {
        // Implement the method that counts how many words in the given String.
        // The words are separate by space. You have to use only length() and charAt() methods of String class.
        //“It’s new task for me” -> 5;
        count("It’s new task for me");

    }
    public static void count (String str) {
        int i = 0;
        int sum = 1;
        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                sum = sum +1;
            }
            i++;
        }
        System.out.println(sum);
    }
}