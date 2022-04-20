public class Main {
    public static void main(String[] args) {
        // Write a method that takes a String and a two chars. As the result it returns the given String,
        // where each the first char was replaced by the second char.
        // You have to use only length() and charAt() methods of String class.
        System.out.println(randomString("That is an absolutely random string", 'a', 'O'));
    }
    public static String randomString (String str, char x, char y){
        int i = 0;
        String result = "";
       while (i < str.length()) {
           if (str.charAt(i) != x) {
               result =result + str.charAt(i);
           } else {
               result = result + y;
           }
           i++;
       }
        return result;
    }
}