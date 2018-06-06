package lt.baltic.talents.lesson.day19.structural.adapter;

public class MicroUsbRecharger {

    private IPhone phone;

    public MicroUsbRecharger(IPhone phone) {
        this.phone = phone;
    }

    public void use() {
        System.out.println("---Recharging iPhone with Generic Recharger---");
        IPhoneAdapter phoneAdapter = new IPhoneAdapter(this.phone);
        phoneAdapter.useMicroUsb();
        phoneAdapter.recharge();
        System.out.println("---iPhone Ready for use---");
    }

}
