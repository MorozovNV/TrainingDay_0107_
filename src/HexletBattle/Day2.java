package HexletBattle;
import java.util.*;import java.util.stream.*;

public class Day2 {
    public static List<String> solution(List<String> words) { //метод заменяет гласные в слове на индексы
        char[] gla = {'a', 'e', 'o', 'y', 'u', 'i'};
        System.out.println("sad");

        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                for (int k = 0; k < gla.length; k++) {
                    if (words.get(i).charAt(j) == gla[k]){
                        String v = String.valueOf(j);
                        words.set(i, words.get(i).substring(0, j) + v + words.get(i).substring(j+1));
                        System.out.println(words.get(i));
                        System.out.println(k);
                        break;
                    }
                }
            }
        }
        return words;
    }

    public static int solution1(List<String> words) { //метод находит сколько дерикторий в слове в массиве слов
        int count=0;
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (words.get(i).charAt(j) == '/'){
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("abcdef");
        a.add("nikita");
        List<String> b = new ArrayList<>();
         b = solution(a);
        System.out.println("Вывод:");
        System.out.println(a);
        System.out.println(b);

    }
}

