package co.develhope.introduction;

import java.time.LocalDate;
import java.time.Year;

public class DateTime {

    public static void main(String... args){

        var today = LocalDate.now();
        var endMonth = LocalDate.of(2023, 6, 30).lengthOfMonth();
        var daysRem = endMonth - today.getDayOfMonth();
        var daysRemYear = Year.of(2023).length() - today.getDayOfYear();
        System.out.printf("%s\n%s\n%s\n%s", today, endMonth, daysRem, daysRemYear);
    }
}
