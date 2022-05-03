public class Main {
    public static void main(String[] args) {
        //Given arrays String[]. Implement the method that returns the shortest String from it.

        String[] first = {"one", "two", "three", "four", "five"};
        System.out.println(shortestString(first));
    }
    public static String shortestString (String[] arr) {
        int i = 0;
        int index = 0;
        String shortest = arr[0];
        while (i < arr.length) {
            if (arr[i].length() < shortest.length()){   //Возможно, недочёт условия, либо я не знаю, как сделать задуманное.
                shortest = arr[i];                      // Нужно вывести Стринг, а не стринговый массив, который бы содержал в себе
            }                                           // несколько равноразмерных стрингов. Вернуть несколько стрингов я тоже не могу
            i++;
        }
        return shortest;

    }
}