public class Main {
    public static void main(String[] args) {
        // Implement the method that takes a strings and returns the new string that contains every second character
        // of the original string
        //“abcde” -> “bd”
        //“Hello Java” -> “el aa”
        System.out.println(everySecondCharacter("abcde"));
        System.out.println(everySecondCharacter("Hello Java"));

    }
    public static String everySecondCharacter (String str){
        String result = "";
        int i = 1;
        while ( i < str.length()){
            result = result + str.charAt(i);
            i = i +2;
        }

        return result;
    }
}