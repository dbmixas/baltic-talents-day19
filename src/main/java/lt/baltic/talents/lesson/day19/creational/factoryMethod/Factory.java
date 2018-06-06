package lt.baltic.talents.lesson.day19.creational.factoryMethod;

public class Factory {

    public static IPerson createPerson(PersonType type)
    {
        switch (type)
        {
            case Rural:
                return new Villager();

            case Urban:
                return new CityPerson();

            default:
                throw new IllegalArgumentException();
        }
    }
}
