package lt.baltic.talents.lesson.day19.creational.prototype;

public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(int a) {
        super(a);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype1)super.clone();
    }
}
