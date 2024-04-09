package lesson03_22.lesson03_13Extend.task_5;


public class Employee implements Comparable<Employee> {
    private String name;
    private Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                name +
                " " + salary +
                '}';
    }
}
