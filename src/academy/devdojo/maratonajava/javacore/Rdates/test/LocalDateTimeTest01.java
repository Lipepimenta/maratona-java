package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.of(6, 39, 50);
        LocalDate localDate = LocalDate.of(2026,1,26);

        LocalTime localTime1 = LocalTime.parse("05:30:00");
        LocalDate localDate1 = LocalDate.parse("2026-01-05");

        System.out.println(localDateTime);
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localTime1);
        System.out.println(localDate1);

        LocalDateTime ldt1 = localDate1.atTime(localTime1);
        System.out.println(ldt1);
        LocalDateTime ldt2 = localTime1.atDate(localDate1);
        System.out.println(ldt2);
    }
}
