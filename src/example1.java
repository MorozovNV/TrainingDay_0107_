import java.util.Scanner;
/* прога вычисляет чему равна последовательность (20+(20+(20+..)^1/2)^1/2)^1/2) = ...
* входные данные с клавиатуры - колличество итераций
* команда d-done
 */
public class example1 {
    public static double method(double s){
        return Math.pow(s+20,0.5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String g;
        int n;
        double s=0.0;
        while (true){
            g = scanner.nextLine();
            if (g.equalsIgnoreCase("d")) break;
            try {
                n = Integer.valueOf(g);
                System.out.println(n);
                for (int i=0; i<n; i++) {
                    s = method(s);
                    System.out.println(s);
                }
            } catch (NumberFormatException e) {
                System.out.println("dick");
            }

        }





    }
}
