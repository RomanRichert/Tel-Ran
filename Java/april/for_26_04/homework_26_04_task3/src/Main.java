public class Main {
    public static void main(String[] args) {
        // Implement the method that takes two Strings and return the String that contain chars from the first string mixed through one with chars from other String
        //“abcd”, “qwer” -> “aqbwcedr”
        //“ab”, “qwer” -> “aqbwer”
        //“abcd”, “qw” -> “aqbwcd”
        System.out.println(mix("abcd", "qwer"));
        System.out.println(mix("ab", "qwer"));
        System.out.println(mix("abcd", "qw"));

    }
    public static String mix(String a, String b) {

        String result = "";
        int i = 0;
        if (a.length() > b.length()) {
            while (i < b.length()) {
                result = result + a.charAt(i) + b.charAt(i);
                i++;
            }
            i = (a.length() - b.length());
            while (i < a.length()) {
                result = result + a.charAt(i);
                i++;
            }
        } else if (b.length() > a.length()) {
            i = 0;
            while (i < a.length()) {
                result = result + a.charAt(i) + b.charAt(i);
                i++;
            }
            i = b.length() - a.length();
            while ( i < b.length()) {
                result = result + b.charAt(i);
                i++;
            }
        } else
        {
            i = 0;
            while (i < a.length()) {
                result = result + a.charAt(i) + b.charAt(i);
                i++;
            }
        }
        return result;
    }
}