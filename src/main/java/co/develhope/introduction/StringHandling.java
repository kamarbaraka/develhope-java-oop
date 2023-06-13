package co.develhope.introduction;

import java.util.Arrays;

public class StringHandling {

    public static void main(String... args){

        var string1  = "Hello";
        var string2 = "How are you?";
        var comString = "%s%s".formatted(string1.substring(0, 2), string2.substring(string2.length()-2));
        var charArray = comString.toCharArray();

        System.out.println(Arrays.toString(charArray));
    }
}
