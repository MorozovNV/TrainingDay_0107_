package Hexlet;

public class Hexlet8 {
    public static int countChars(String str, char ch) { //проверка на колличесвто символом без учета регистра
        // BEGIN (write your solution here)
        int i=0;
        int count = 0;
        str = str.toLowerCase();
        String chS = "" + ch;
        chS = chS.toLowerCase();
        while(i<str.length()){
            if (str.charAt(i)==chS.charAt(0)) count+=1;
            i+=1;
        }
        return count;
        // END
    }

    public static void main(String[] args) {
        System.out.println(countChars("Diana",'a'));
    }
}
