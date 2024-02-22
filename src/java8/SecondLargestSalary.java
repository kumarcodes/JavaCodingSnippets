package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

}

public class SecondLargestSalary {

    public static void main(String[] args) {


        List<Employee> employeeList = Arrays.asList(new Employee("Deepak", 60000),
                new Employee("Anand", 75000),
                new Employee("Rohit", 80000),
                new Employee("Raj", 70000));

        //Find the second-largest Salary.
        int secondLargest = employeeList.stream()
                .mapToInt(Employee::getSalary)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder()).skip(1).
                findFirst()
                .orElseThrow(() -> new RuntimeException("No second Largest Salary Found"));
        System.out.println(secondLargest);

        //Find the second-largest salary employee name
        Employee emp = employeeList.stream().distinct().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1)
                .findFirst()
                .orElseThrow(() ->  new RuntimeException("No second largest salary employee is present."));
        System.out.println(emp.getName());
    }
}
