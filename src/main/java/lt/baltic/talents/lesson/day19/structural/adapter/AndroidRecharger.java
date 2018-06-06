package lt.baltic.talents.lesson.day19.structural.adapter;

public class AndroidRecharger {

    private Android phone;

    public AndroidRecharger(Android phone) {
        this.phone = phone;
    }

    public void use() {
        System.out.println("---Recharging Android Phone with Generic Recharger---");
        phone.useMicroUsb();
        phone.recharge();
        System.out.println("---Phone Ready for use---");
    }
}
