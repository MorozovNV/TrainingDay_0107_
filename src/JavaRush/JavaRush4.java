package JavaRush;

public class JavaRush4 {

    public static void main(String[] args) {
        //�������� ��� ��� ���

        Outer a = new Outer();
        Outer.Inner c = a.new Inner();
        Outer.Nested b = new Outer.Nested();
    }
}

class Outer {
    class Inner {
        Inner() {
            System.out.println("�������� ������� ����������� ������");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("�������� ������� ���������� ������");
        }
    }
}
