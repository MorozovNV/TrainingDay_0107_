package Hexlet;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Hexlet4 {

    public static String convertString(String str){
        if (str.equals("")){
            return "";
        }

        String strUp = str.toUpperCase();
        char strUpOne = strUp.charAt(0);
        System.out.print("method work: ");

        if(strUpOne==str.charAt(0)) {
            return str;
        } else {
            return StringUtils.reverse(str);
        }
    }

    public static void main(String[] args) {

        String a = "b";
        Scanner scan = new Scanner(System.in);

        while(true) { //бесконечный цикл
            a = scan.next(); //читаем строку
            if (a.equals("n")) break; //условие завершения цикла
            System.out.println(convertString(a));
        }
    }
}
