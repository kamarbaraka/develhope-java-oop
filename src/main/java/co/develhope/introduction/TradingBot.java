package co.develhope.introduction;

public class TradingBot {

    public static void main(String... args){
        var days = 0;
        var cash = 10_000;

        while (cash != 0){
            var rate = 1 + (Math.random() * 0.2);

            if (rate == 1.15)
                cash -= 1000;
            days++;
        System.out.println(cash);
        System.out.println(days);
        }
    }
}
