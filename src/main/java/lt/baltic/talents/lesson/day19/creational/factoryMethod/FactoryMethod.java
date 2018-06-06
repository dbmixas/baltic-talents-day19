package lt.baltic.talents.lesson.day19.creational.factoryMethod;

public class FactoryMethod {

    public static void main(String[] args) {

        IPerson person = Factory.createPerson(PersonType.Rural);

        System.out.println(person);

        person = Factory.createPerson(PersonType.Urban);

        System.out.println(person);
    }
}
