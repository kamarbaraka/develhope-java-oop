package co.develhope.introduction;

import java.util.Arrays;

public class Arrayss {

    public static void main(String... args){

        var carBrands = new String[] {"Hyundai", "Mercedes", "Toyota", "Nissan", "LandRover"};
        System.out.println(carBrands.length);
        System.out.println(carBrands[2]);

        var primeNumbers = new int[6];
        primeNumbers[0] = 1; primeNumbers[1] = 2; primeNumbers[2] = 5; primeNumbers[3] = 7;
        primeNumbers[4] = 11; primeNumbers[5] = 13;

        System.out.println(Arrays.toString(primeNumbers));

    }
}
