public class Main {
    public static void main(String[] args) {
        // Given the String like “20*((876/8)+19)” , implements the method that check if the parentheses are correct. Try to solve it yourself without help of Google
        //“9*(8+3)-( (9+1)5)” -> true
        //“9(8+3)- (9+1)5)” -> false
        //“98+3)-( (9+1)*5” -> false
        System.out.println(parentheses("9*(8+3)-( (9+1)5)"));
        System.out.println(parentheses("9(8+3)- (9+1)5)"));
        System.out.println(parentheses("98+3)-( (9+1)*5"));
        System.out.println(parentheses("()))))((((()"));
        System.out.println(parentheses("(356(GG))56)(6"));
    }

    public static Boolean parentheses(String str) {
        boolean result = true;
        int i = 1;
        int fix = 0; //фиксирует открытие/закрытие скобки
        int open = 0;
        int closed = 0;
        int i2 = 0; //шаг для счетчика скобок
        int n = 0; // чтобы меня условия if в цикле

        while (i2 < str.length()) {
            if (str.charAt(i2) == ')') {
                open++;
            }
            if (str.charAt(i2) == '(') {
                closed++;
            }
            i2++;
        }
        if (open == closed) {                                   // сравнивает количество '(' и ')'
            result = true;
        } else {
            result = false;
        }

        if (result == true) {                                      // проверяет какая скобка первая
        while ((i < str.length()) && (str.charAt(i-1) != ')' ) ) {
            if (str.charAt(i) == '(') {
                fix = 1;
            }
            if ((str.charAt(i) == ')' )&& fix > 0) {
                result = true;
            } else if ((str.charAt(i) == ')' )&& fix == 0) {
                result = false;
            }
            i++;
        }

        }
        if (result == true) {                               // проверяет какая скобка последняя
            i = str.length() -2;
            fix = 0;
            while ((i > 0) && (str.charAt(i +1) != '(')) {
                if (str.charAt(i) == ')') {
                    fix = 1;
                }
                if ((str.charAt(i) == '(') && fix == 1) {
                    result = true;
                } else if ((str.charAt(i) == '(') && fix == 0) {
                    result = false;
                }
                i--;
            }

        }
        if (result == true) {
            i = 1;
            fix = 0;
            while (i < str.length()) {                           // проверяет случай ()))))((((() ... а, возможно
                if (str.charAt(i) == '(') {                      // этого куска хватило бы на все случаи, но мой котелочек уже не варит.
                    fix++;
                    n = fix - 1;
                }                                                // UPD: почему-то подобный случай не проходит предыдущие фильтры. где-то я сам себя переиграл.
                if ((str.charAt(i) == ')') && fix > n) {
                    result = true;
                } else if ((str.charAt(i) == ')') && fix <= n) {
                    result = false;
                }
                i++;
            }
        } else {
            result = false;
        }


        return result;
    }
}