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

        //2. Find min, max and avg of salary.
        double minSal = employees.stream().mapToDouble(emp -> emp.getSalary()).summaryStatistics().getMin();
        System.out.println("Minimum Salary:" + minSal);
        double maxSal = employees.stream().mapToDouble(emp -> emp.getSalary()).summaryStatistics().getMax();
        System.out.println("Maximum Salary:" + maxSal);
        double avgSal = employees.stream().mapToDouble(emp -> emp.getSalary()).summaryStatistics().getAverage();
        System.out.println("Average Salary:" + avgSal);
        int count = (int) employees.stream().mapToInt(emp ->emp.getId()).summaryStatistics().getCount();
        System.out.println("Count of employees:" + count);

    }
}
