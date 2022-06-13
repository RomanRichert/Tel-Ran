import java.util.Arrays;

public class ArrayDistributer {
    Integer[] array;

    public Integer[] getArray(int userChoice) {
        switch(userChoice){
            case 1:  array = new UserArray().getArray(); break;
            case 2:  array = new RandomArray().getArray(); break;
            case 3: array = new MyArray().getArray(); break;

        }

        return array;
    }
}
