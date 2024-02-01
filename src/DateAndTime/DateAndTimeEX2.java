package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateAndTimeEX2
{
    public static void main(String s[])
    {
//        To take local date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
//To print date
        LocalDate localDate = LocalDate.of(2024, Month.JANUARY, 14);
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.ofYearDay(2024, 325);//give date
        System.out.println(localDate1);

        int hour = LocalTime.now().getHour();
        System.out.println(hour);

//        LocalDateTime localDateTime = localDate1.atStartOfDay();
//         System.out.println(localDateTime);

    }
}
