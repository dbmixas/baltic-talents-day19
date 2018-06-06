package lt.baltic.talents.lesson.day19.creational.builder;

public class Builder {

    public static void main(String[] args) {

        Car car = Car.builder()
                .setColor("black")
                .setWheels(6)
                .build();

        System.out.println(car);
        System.out.println(Car.builder().setColor("black").build());
    }
}
