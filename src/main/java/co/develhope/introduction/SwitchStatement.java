package co.develhope.introduction;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String... args){

        var input = new Scanner(System.in);
        while (true){
            System.out.println("enter number 1 - 10");

            System.out.println(switch (input.nextInt()) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                case 10 -> "ten";
                default -> "cannot give you the name";
            });

        }
    }
}
