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

        Map<Integer, List<Employees>> employeesIntegerMap = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge()));

        employeesIntegerMap.forEach((age, names) -> {
            System.out.println("Age: " + age);
            names.forEach(name -> System.out.println("Name: " + name));
        });


        for (Map.Entry<Integer, List<Employees>> entry : employeesIntegerMap.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue().size());

        }

    }
}
