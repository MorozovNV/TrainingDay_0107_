package Hexlet;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Hexlet2 {
    public static void gogo() {

    }

    public static void main(String[] args) {

        System.out.println((int)(Math.random()*10));

        // � ����
        LocalDate dateFrom = LocalDate.of(1995, Month.NOVEMBER, 16);
        // �� ����
        LocalDate dateTo = LocalDate.of(2022, Month.AUGUST, 24);
         // ���������� ���� ����� ����� ������
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);

        // � ����
        dateFrom = LocalDate.of(1995, Month.APRIL, 4);
        // �� ����
        dateTo = LocalDate.of(2022, Month.AUGUST, 24);
        // ���������� ���� ����� ����� ������
        noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);

        // � ����
        dateFrom = LocalDate.of(1976, Month.JUNE, 23);
        // �� ����
        dateTo = LocalDate.of(2022, Month.AUGUST, 24);
        // ���������� ���� ����� ����� ������
        noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
        System.out.println(dateTo);


        gogo();
    }
}
