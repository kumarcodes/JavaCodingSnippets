package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEmployeesByAge {

    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<Employees>();
        employees.add(new Employees(1, "Rohit", 28, 133300.0, "SSE"));
        employees.add(new Employees(2, "Deepak", 28, 123300.0, "SSE"));
        employees.add(new Employees(3, "Sandip", 29, 143300.0, "Lead"));
        employees.add(new Employees(4, "Jagan", 27, 109300.0, "SE"));
        employees.add(new Employees(5, "Allam", 27, 107300.0, "SE"));


        //1. Sort the employees by age
        Map<Integer, List<Employees>> employeesIntegerMap = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge()));

        System.out.println(employeesIntegerMap);

        employeesIntegerMap.forEach((age, names) -> {
            System.out.println("Age: " + age);
            names.forEach(name -> System.out.println("Name: " + name));
        });


        for (Map.Entry<Integer, List<Employees>> entry : employeesIntegerMap.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue().size());

        }

        //2. Find min salary.
        double minSal = employees.stream().mapToDouble(emp -> emp.getSalary()).summaryStatistics().getMin();
        System.out.println("Minimum Salary:" + minSal);
        //3. Find maximum salary
        double maxSal = employees.stream().mapToDouble(emp -> emp.getSalary()).summaryStatistics().getMax();
        System.out.println("Maximum Salary:" + maxSal);
        //4. Find average salary
        double avgSal = employees.stream().mapToDouble(emp -> emp.getSalary()).summaryStatistics().getAverage();
        System.out.println("Average Salary:" + avgSal);
        //5. Count total number of Employees
        int count = (int) employees.stream().mapToInt(emp -> emp.getId()).summaryStatistics().getCount();
        System.out.println("Count of employees:" + count);
        //6. Sort ages in ascending order.
        List<Integer> ages = employees.stream().mapToInt(emp -> emp.getAge()).boxed().sorted().collect(Collectors.toList());
        System.out.println("Ages sorted in ascending order:" + ages);
        //7. Task Select age from 1st position till 3rd position.
        List<Integer> limitTwo = ages.stream().skip(1).limit(2).collect(Collectors.toUnmodifiableList());
        System.out.println("Limit ascending order:" + limitTwo);
        //8. Task Convert all the employee names into UPPERCASE
        List<String> names = employees.stream().map(emp -> emp.getName()).collect(Collectors.toUnmodifiableList());
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

    }
}
