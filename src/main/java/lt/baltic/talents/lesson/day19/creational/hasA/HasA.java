package lt.baltic.talents.lesson.day19.creational.hasA;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HasA {

    public static void main(String[] args) {

        Staff staff = new Staff(
                "Jonas", "Address",
                BigDecimal.valueOf(1000),
                LocalDate.of(2016, 2, 29),
                LocalDate.of(2017, 1, 31));

        System.out.println(staff);

        System.out.println(staff.getName());
        System.out.println(staff.getAmount());
    }
}
