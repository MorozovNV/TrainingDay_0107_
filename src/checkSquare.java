import java.util.Scanner; //�������� �����)

public class checkSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �����");

        while (true) {
            var g = scanner.nextLine();
            if(g.equals("n")) break;

            try {
                int num = Integer.parseInt(g);
                System.out.println(num);
                System.out.println("��� ��� ��! ���������.");
                System.out.print(Math.sqrt(num));

                if (Math.sqrt(num) % 1 == 0) System.out.println("  -> ����� �� �������!");
                else System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("�� �����? ����� ����� �����! ������: ");
            }

        }
    }
}

class Square {
    public static boolean isSquare(int n) {
        if (Math.sqrt(n) % 1 == 0) return true; // fix me!
        else return false;
    }
}
