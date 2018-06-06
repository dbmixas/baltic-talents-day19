package lt.baltic.talents.lesson.day19.behavioral.chainOfResponsibility;

public class DirectorPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 20;
    }

    protected String getRole() {
        return "Director";
    }
}
