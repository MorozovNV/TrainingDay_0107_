package Hexlet;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Hexlet2 {
    public static void gogo() {

    }

    public static void main(String[] args) {

        System.out.println((int)(Math.random()*10));

        // С даты
        LocalDate dateFrom = LocalDate.of(1995, Month.NOVEMBER, 16);
        // По дату
        LocalDate dateTo = LocalDate.of(2022, Month.AUGUST, 24);
         // Количество дней между этими датами
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);

        // С даты
        dateFrom = LocalDate.of(1995, Month.APRIL, 4);
        // По дату
        dateTo = LocalDate.of(2022, Month.AUGUST, 24);
        // Количество дней между этими датами
        noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);

        // С даты
        dateFrom = LocalDate.of(1976, Month.JUNE, 23);
        // По дату
        dateTo = LocalDate.of(2022, Month.AUGUST, 24);
        // Количество дней между этими датами
        noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
        System.out.println(dateTo);


        gogo();
    }
}
