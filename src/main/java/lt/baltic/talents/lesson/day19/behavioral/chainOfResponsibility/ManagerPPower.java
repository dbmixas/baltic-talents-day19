package lt.baltic.talents.lesson.day19.behavioral.chainOfResponsibility;

public class ManagerPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 10;
    }

    protected String getRole() {
        return "Manager";
    }
}
