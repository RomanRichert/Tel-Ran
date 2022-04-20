package com.company;

public class Main {

    public static void main(String[] args) {
	// 1. Implement the program that checks if one integer is divisible by another integer without any remainder or not.
        // (Hint: Use the modulo (%) operator in Java. The % operator that returns the remainder of two integers.
        // For example 17%3 is 2 because 17 divided by 3 leaves a remainder of 2, but 15%3 is 0).
        // Print the result in the main method.
        //Examples: (10,2) -> true
        //(10,3) -> false
        int a=10;
        int b=2;
        boolean result=a%b==0;
        System.out.println("1. "+a+" is divisible by "+b+" without any remainder: "+result);
        // 2. Let’s imagine that we have a device, which has two flasks.
        //  The device works correct if temperature of the first flask is above 100 degrees and the temperature of
        //  the second flask is less than 100 degree. You should write the program that checks this device.
        //  You should write the program that checks the device. Your program has to variables temperature1 and temperature2.
        // As a result it prints the message true or false.
        double temperature1=183.5;
        double temperature2=-18.35;
        boolean device1=temperature1>100&&temperature2<100;
        System.out.println("2. "+device1);
        // 3. The conditions of this task is the same like the previous task but the device works correct if temperature of
        // the one of the flasks is above 150 degrees and the temperature of the another flask is less than 0 degree.
        // (NOTE! The first flask’s temperature may be above 150 or less 150 then the second flask’s temperature is
        // less 0 or above 0 respectively.)
        device1=(temperature1>150&&temperature2<0)||(temperature1<0&&temperature2>150);
        System.out.println("3. "+device1);
        // 4. The conditions of this task are the same like the previous task but our device has three flasks.
        // The device works correct if only one of the flasks has a temperature less than 0 and two others has a
        // temperature above .0 and different each other.
        double temperature3=18.35;
        device1=((temperature1>150&&temperature2<0)||(temperature1<0&&temperature2>150))&&(temperature3>0)&&((temperature1!=temperature3)&&(temperature3!=temperature2));
        System.out.println("4. "+device1);
        // я не писал взаимоисключающие условия, ибо это сделает код лишь сложнее и длиннее при том же результате.
        // Например, нам не нужно писать, что t1 и t2 могут быть ниже 0, это и так будет, так как мы переняли условия
        // предыдущей задачи. В таком случае, если t3 будет ниже 0, то устройство сразу перестанет работать, так что
        // держу его больше 0. Так же нет смысла сравнивать t1 и t2 - если они равны, то так же ничего не заработает.


    }
}
