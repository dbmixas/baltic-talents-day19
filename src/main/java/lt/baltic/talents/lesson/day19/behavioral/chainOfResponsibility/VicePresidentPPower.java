package lt.baltic.talents.lesson.day19.behavioral.chainOfResponsibility;

public class VicePresidentPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 40;
    }

    protected String getRole() {
        return "Vice President";
    }
}
