package Hexlet;

public class Hexlet1 {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println(10%3);
        System.out.println(10+-3);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("");

        //экранирование
        System.out.println("Dragon's mother say \"No\"");
        System.out.println("");
        System.out.println("- Are you hungry?\n- Aaaarrrgh!");
        System.out.println("");
        System.out.println("-wot tak daa\r\n-ne govori\n-ne delai tak bol'she");
        System.out.println("");

        //преобразование типов
        // станет int
        var number = Integer.parseInt("345");
        System.out.println(number); // => 345
        var result = (int) 5.1;
        System.out.println(result); // => 5
        var result1 = (int) 5.99;
        System.out.println(result1); // =>5


    }
}

