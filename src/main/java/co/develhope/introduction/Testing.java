package co.develhope.introduction;

public class Testing {

    public static void main(String... args){

        var a = 15;
        a += 5;
        a -= 4;
        var b = a;
        b++;

        var bIsOdd = b % 2 == 0;
        var bIsMultipleOf3 = (b * (b+1))%3 == 0;
    }
}
