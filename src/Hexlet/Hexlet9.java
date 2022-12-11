package Hexlet;

import java.util.Scanner;

public class Hexlet9 {//метод меняет местами каждые два символа

    public static String encrypt(String str) {
        String res="";

        if (str.equals("")) {
            System.out.println("Empty");
            return "";
        }

        if(str.length()%2==0){
            for(var i=0;i<str.length();i+=2){
                res=res+str.charAt(i+1)+str.charAt(i);
            }
        }else {
            for(var i=0;i<str.length()-1;i+=2){
                res=res+str.charAt(i+1)+str.charAt(i);
            }
            res+=str.charAt(str.length()-1);
        }
        return res;
    }

    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            str = scanner.next();

            if (str.equals("n")) {
                break;
            }
            System.out.println(encrypt(str));

        }

        scanner.close();
    }
}
