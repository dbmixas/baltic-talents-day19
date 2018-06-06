package lt.baltic.talents.lesson.day19.structural.adapter;

public class IPhoneRecharger {

    private IPhone phone;

    public IPhoneRecharger(IPhone phone) {
        this.phone = phone;
    }

    public void use() {
        System.out.println("---Recharging iPhone with iPhone Recharger---");
        phone.useLightning();
        phone.recharge();
        System.out.println("---iPhone Ready for use---");
    }
}
