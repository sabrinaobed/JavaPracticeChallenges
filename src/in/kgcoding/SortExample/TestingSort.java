package in.kgcoding.SortExample;

import java.util.List;

public class TestingSort {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Sabrina", 10000000),
                new Employee("Obed", 20000000),
                new Employee("Verdha", 1000000),
                new Employee("Milli", 3000000),
                new Employee("Sadrik", 60000000));

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);

    }
}