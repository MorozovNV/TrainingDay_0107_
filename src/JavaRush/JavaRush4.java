package JavaRush;

public class JavaRush4 {

    public static void main(String[] args) {
        //напишите тут ваш код

        Outer a = new Outer();
        Outer.Inner c = a.new Inner();
        Outer.Nested b = new Outer.Nested();
    }
}

class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
