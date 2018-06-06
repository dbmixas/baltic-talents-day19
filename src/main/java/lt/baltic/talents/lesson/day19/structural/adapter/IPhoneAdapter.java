package lt.baltic.talents.lesson.day19.structural.adapter;

// Adapter
public class IPhoneAdapter implements IFormatAndroid {

    private IFormatIPhone mobile;

    public IPhoneAdapter(IFormatIPhone mobile) {
        this.mobile = mobile;
    }

    @Override
    public void recharge() {
        mobile.recharge();
    }

    @Override
    public void useMicroUsb() {
        System.out.println("Adapter MicroUsb <-> Lightning connected");
        mobile.useLightning();
    }
}
