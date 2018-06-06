package lt.baltic.talents.lesson.day19.creational.factoryMethod;

public class Villager implements IPerson {

    @Override
    public String getName() {
        return "Village Person";
    }

    @Override
    public String toString() {
        return "Villager{" + getName() + "}";
    }
}
