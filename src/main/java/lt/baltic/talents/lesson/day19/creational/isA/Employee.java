package lt.baltic.talents.lesson.day19.creational.isA;

import java.math.BigDecimal;

public class Employee extends Man {

    String position;

    BigDecimal salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
