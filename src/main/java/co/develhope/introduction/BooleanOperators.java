package co.develhope.introduction;

public class BooleanOperators {

    public static void main(String... args){

        var a = 2 <= 2 && !true;
        var b = ! false && 3 > 2;
        var t = false; var f = true;
        var c = !(!t || f);
        var d = 6 > 6 ^ !(true && true);

        System.out.printf("%s %s %s %s", a, b, c, d);
    }
}
