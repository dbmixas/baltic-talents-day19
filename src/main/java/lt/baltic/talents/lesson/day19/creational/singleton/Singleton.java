package lt.baltic.talents.lesson.day19.creational.singleton;

public class Singleton implements ISingleton {

    private static Singleton instance = null;

    double number = 0;

    private Singleton() {}

    public static ISingleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    instance.number = Math.random();
                }
            }
        }
        return instance;
    }

    public double getNumber() {
        return number;
    }
}
