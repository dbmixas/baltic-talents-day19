package lt.baltic.talents.lesson.day19.creational.prototype;

public class ConcretePrototype2 extends Prototype {

    public ConcretePrototype2(int a) {
        super(a);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype2) super.clone();
    }

}
