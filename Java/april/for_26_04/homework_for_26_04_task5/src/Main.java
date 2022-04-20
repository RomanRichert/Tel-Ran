import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // 5. Write method boolean isPalindrome(String) that checks whether a given word is a palindrome.
        // A palindrome is a word that reads the same from the front and the back.
        //isPalindrome(“довод”) -> true
        //isPalindrome(“невод”) -> false

        // 6. Implement the previous task for phrase. Ignore spaces, punctuation marks ( “, . –“) and regardless of case.
        // Hint: use the String.toLowerCase method
        //isPalindrome(“А роза упала на лапу Азора”) -> true

        System.out.println(isPalindrome("довод"));
        System.out.println(isPalindrome("невод"));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));

    }
    public static boolean isPalindrome (String str) {
        boolean result;
        String str1 = "";
        String str2 = "";
        char e = ' ';
        int i = 0;

        while ( i < str.length()/2) {
            str1 = str1 + str.charAt(i);
            i++;
        }
        i = str.length() - 1;
        while ( i > str.length()/2 && i < str.length()) {
            str2 = str2 + str.charAt(i);
            i--;
        }
        str1 = str1.toLowerCase(Locale.ROOT);
        str1 =str1.replaceAll("\\s+","");

        str2 = str2.toLowerCase(Locale.ROOT);
        str2 = str2.replaceAll("\\s+","");

        result = str1.equals(str2);

        return result;
    }
}