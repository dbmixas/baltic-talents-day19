package lt.baltic.talents.lesson.day19.structural.adapter;

public class Adapter {

    public static void main(String[] args) {

        new IPhoneRecharger(new IPhone()).use();

        new AndroidRecharger(new Android()).use();

        new MicroUsbRecharger(new IPhone()).use();

    }
}
