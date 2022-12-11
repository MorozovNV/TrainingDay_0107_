package JavaRush;

public class JavaRush2 {
    public static class Main {
        public static void main(String[] args) {
            Car Car1 = new Car();
            Car1.setModelName("Java");
            Car1.setSpeed(60);
            System.out.println(Car1.getModelName() + " Скорость: " + Car1.getSpeed());

            Car Car2 = new Car();
            Car2.setModelName("Pop");
            System.out.println(Car1.getModelName()+" " +Car2.getModelName());
        }
    }
}
class Car {
    private static String modelName;
    private int speed;

    public static String getModelName() {
        return modelName;
    }

    public static void setModelName(String modelName) {
        Car.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}