package JavaRush;

public class JavaRush3 {
    public static void main(String[] args) {
        //напишите тут ваш код

        Engine engine = new Engine();
        engine.getRunning();
        engine.start();
        engine.getRunning();
        engine.stop();
        engine.getRunning();

    }
}
class Engine {
    private boolean isRunning;

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public void getRunning() {
        System.out.println(isRunning);
    }
}
