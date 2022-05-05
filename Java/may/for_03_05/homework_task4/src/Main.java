import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Implement your own split method. It should break a given string around matches of the char delimiter.
        // As a result it should return array of substrings. Don’t use the String.split method
        //For example:
        //(“Java is very easy!”, ’ ‘) -> {“Java”,”is”,”very”,”easy”}
        //(“Java is very easy!”, ’v‘) -> {“Ja”,“a is”,”ery easy”}
        //(“Java is very easy!”,’!‘) -> {“Java is very easy”}
        //(“Java is very easy!”,’:‘) -> {“Java is very easy!”}
        System.out.println(Arrays.toString(splitMethod("Java is very easy!", ' ')));
        System.out.println(Arrays.toString(splitMethod("Java is very easy!", 'v')));
        System.out.println(Arrays.toString(splitMethod("Java is very easy!", '!')));
        System.out.println(Arrays.toString(splitMethod("!Java is very easy", '!')));
        System.out.println(Arrays.toString(splitMethod("Java is very easy!", ':')));
    }
    public static String[] splitMethod (String str, char delimiter) {
     int i =0;
     int delimiterCount = 0;
     while (i < str.length()) {                                        // считаю число разделителей
         if (str.charAt(i) == delimiter) {
             delimiterCount++;
         }
         i++;
     }

     String[] strArray = new String[delimiterCount+1];
     int[] delimiterIndex = new int[delimiterCount];

     i = 0;
     int a = 0; // шаг для массива delimiterIndex
     while (i < str.length()){                                          // устанавливаю индексы разделителей
         if (str.charAt(i) == delimiter) {
             delimiterIndex[a] = i;
             a++;
         }
         i++;
     }

     i = 0;
     a=0;
     int k =0;
     while (i < str.length()) {                                       // собираю массив
         if (str.charAt(i) == delimiter) {
             strArray[a] = str.substring(k, delimiterIndex[a]);
             k = delimiterIndex[a]+1;
             a++;
         }
         i++;
     }
     strArray[strArray.length-1] = str.substring(k);

     String[] ifDelimiterIsInTheEnd = {(strArray[0])};                      // учитываю особые случаи
     String[] ifDelimiterIsAtTheStart = {(strArray[strArray.length-1])};
    if (delimiterCount == 1 && str.charAt(str.length()-1) == delimiter) {
         return ifDelimiterIsInTheEnd;
     } else if (delimiterCount == 1 && str.charAt(0) == delimiter){
        return ifDelimiterIsAtTheStart;
    } else {
        return strArray;
     }



    }
}