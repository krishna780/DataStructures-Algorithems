package com.dataStructures.Algorithems.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Example {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee(12, 10000, "ravi"));
        employeeList.add(new Employee(10, 5000, "krishna"));
        employeeList.add(new Employee(8, 1000, "venkat"));
        employeeList.add(new Employee(9, 5000, "krishna"));
       /* List<Map.Entry<String, List<Employee>>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(@NonNull Employee::getName))
                .entrySet().stream()
                .filter( s ->s.getValue().size() > 1)
                .collect(toList());
      //  System.out.println(collect);
        Map<String, String> hashMap=new HashMap<>();

        Map<Integer, String> collect1 = employeeList.stream()
                .collect(Collectors.toMap(@NonNull  Employee::getId,
                        @NonNull Employee::getName));
        List<String> collect2 = employeeList.stream().map(
        @NonNull Employee::getName).collect(toList());

        employeeList.stream().filter(s->"krishna".equalsIgnoreCase(
                s.getName())).collect(toList());

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();*/
 employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.collectingAndThen(toList(), k -> k
                        .stream().filter(s -> s.getName().equalsIgnoreCase("krishna")).collect(toList())))).entrySet()
         .stream().filter(s->!s.getValue().isEmpty()).forEach(System.out::println);

    }
}
