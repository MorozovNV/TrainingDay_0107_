package Hexlet;

public class Hexlet6 {
    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)

        int i = start;
        String result = "";

        while(i<=finish){
            result +=Integer.toString(i) ;
            i+=1;
        }
        return result;

        // END
    }

    public static void main(String[] args) {
        System.out.println(joinNumbersFromRange(5,10));
    }
}
