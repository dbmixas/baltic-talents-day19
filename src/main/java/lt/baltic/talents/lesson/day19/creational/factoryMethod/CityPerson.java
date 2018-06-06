package lt.baltic.talents.lesson.day19.creational.factoryMethod;

public class CityPerson implements IPerson {

    @Override
    public String getName() {
        return "City Person";
    }

    @Override
    public String toString() {
        return "CityPerson{" + getName() + "}";
    }
}
