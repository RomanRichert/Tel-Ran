import java.awt.*;

public class Car {
    String model;
    int releaseYear;
    String color;

    public Car (String mModel, int mReleaseYear, String mColor){
        model = mModel;
        releaseYear = mReleaseYear;
        color = mColor;
    }

    public void print () {
        System.out.println("Model: "+model);
        System.out.println("Release year: "+releaseYear);
        System.out.println("Color: "+color);
        System.out.println("---------------------------");
    }
}
