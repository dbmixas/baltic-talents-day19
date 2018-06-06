package lt.baltic.talents.lesson.day19.structural.flyweight;

public class Flyweight {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        int [] characterCodes = {1, 2, 3, 2, 1};

        for (int nextCode : characterCodes){

            EnglishCharacter character = factory.getCharacter(nextCode);

            System.out.print(character + ": ");

            character.printCharacter();
        }

    }
}
