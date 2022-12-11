package Example1;

public class Hexlet10 {
    public static int bigLettersCount(String str){//принимает строку, говорит сколько заглавных.
        char ch;
        int i=0;
        int count=0;
        while(i<str.length()){
            ch = str.toUpperCase().charAt(i);
            if(ch==str.charAt(i)) count++;
            i++;
        }
        return count;
    }


}
