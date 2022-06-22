import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Дан List<String>. Написать метод, который возвращает строку, которая есть результат объединения всех
        // строк исходного листа через пробел. Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”.

        // 2. Дан List<String>. Написать метод, который возвращает строку, которая есть результат объединения всех
        // строк исходного листа через пробел, при этом, все слова, короче 4 символов должны идти вначале строки,
        // остальные слова должны сохранить свой порядок.
        // Например: {“The”, “homework”, “is”, ”not”, “done”, “yet”} -> “The is not yet homework done”.

        List<String> stringList = new ArrayList<>();
        stringList.add("The");
        stringList.add("homework");
        stringList.add("is");
        stringList.add("not");
        stringList.add("done");
        stringList.add("yet");

        System.out.println(stringListToString(stringList));
        System.out.println("----------------------------");
        System.out.println(stringListToString2(stringList));

    }

    public static String stringListToString (List<String> stringList) {
        String stringFromList ="";
        for (String sl: stringList) stringFromList += sl + " ";
        return stringFromList;
    }

    public static String stringListToString2 (List<String> stringList) {
        String stringFromList ="";
        String tmp ="";
        for (String sl: stringList) {
            if (sl.length() < 4) {
                stringFromList += sl +" ";
            } else {
                tmp += sl+" ";
            }
        }

        return stringFromList+tmp;
    }
}