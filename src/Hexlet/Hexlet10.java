package Hexlet;

public class Hexlet10 {

    public static boolean greaterThan(String str1,String str2){
        int a = Example1.Hexlet10.bigLettersCount(str1);
        int b = Example1.Hexlet10.bigLettersCount(str2);
        if (a>b) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Example1.Hexlet10.bigLettersCount("Boba"));
        System.out.println(greaterThan("Boba","FoRest"));
        System.out.println(greaterThan("BoBaBa","FoRest"));
    }
}
