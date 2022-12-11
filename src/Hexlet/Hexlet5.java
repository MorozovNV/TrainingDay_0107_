package Hexlet;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Hexlet5 {

    public static String getNumberExplanation(int num){

        switch (num){
            case 666:
                return "devil number";
            case 7:
                return "prime number";
            case 42:
                return "answer for everything";
            default:
                return null;
        }

    }

    public static String reverse(String str){
        String result = "";
        int i = 0;

        while(i<str.length()){
            result=str.charAt(i)+result;
            i+=1;
        }
        return result;
    }

    public static void writeDown(String str){
        int i = 0;
        while(i<str.length()){
            System.out.println(str.charAt(i));
            i+=1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(getNumberExplanation(666));
        System.out.println(getNumberExplanation(7));
        System.out.println(getNumberExplanation(42));

        String str;
        Scanner scanner = new Scanner(System.in);
        int f;

        while(true) {

            str = scanner.next();
            if (str.equals("n")) {
                break;
            } else if (str.equals("d")) {
                str =scanner.next();
                writeDown(str);
            } else {
                System.out.println(Hexlet5.reverse(str));
            }

            f=3;
            while (scanner.nextLine().equals("")){
                System.out.println(f);
                Thread.sleep(1000);
                f-=1;
            }
            System.out.println("go:");

        }
        pow(2,30);

        scanner.close();

    }
}
