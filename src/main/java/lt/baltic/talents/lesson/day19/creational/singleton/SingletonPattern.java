package lt.baltic.talents.lesson.day19.creational.singleton;

public class SingletonPattern {

    public static void main(String[] args) {

        ISingleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.getNumber());

        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ISingleton singleton2 = Singleton.getInstance();
            System.out.println(singleton2.getNumber());

        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ISingleton singleton2 = Singleton.getInstance();
            System.out.println(singleton2.getNumber());

        }).start();

        printSingletonValue(Singleton.getInstance());
        printSingletonValue(new DummySingleton());

    }

    static void printSingletonValue(ISingleton singleton) {
        System.out.println(singleton.getNumber());
    }
}
