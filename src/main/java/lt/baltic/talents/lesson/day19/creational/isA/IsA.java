package lt.baltic.talents.lesson.day19.creational.isA;

import java.math.BigDecimal;

public class IsA {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Jonas");
        employee.setAddress("Address");
        employee.setSalary(BigDecimal.valueOf(1000));
        employee.setPosition("Semi-Boss");

        System.out.println(employee);

        print(employee);
    }

    static void print(Man man) {
        System.out.println(man);
    }
}
