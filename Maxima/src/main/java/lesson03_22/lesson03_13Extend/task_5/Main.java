package lesson03_22.lesson03_13Extend.task_5;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

@Slf4j
public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Anna", 90_000);
        Employee emp2 = new Employee("Boris", 80_000);
        Employee emp3 = new Employee("Sergey", 95_000);
        Employee emp4 = new Employee("Maria", 83_000);

        List<Employee> empList = new ArrayList<>();
        Collections.addAll(empList, emp4, emp2, emp1, emp3);
        log.info("Натуральный порядок сортировки: ");
        Collections.sort(empList);
        log.info("" + empList);


        log.info("Сортировка с помощью Comparator по зарплате: ");
        empList.sort(new EmployeeSalaryComparator());
        log.info("" + empList);

        log.info("Натуральная сортировка древа: ");
        TreeSet<Employee> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, emp4, emp2, emp1, emp3);
        log.info("" + treeSet);

        log.info("Сортировка древа с помощью Comparator по зарплате: ");
        TreeSet<Employee> treeSet2 = new TreeSet<>(new EmployeeSalaryComparator());
        Collections.addAll(treeSet2, emp4, emp2, emp1, emp3);
        log.info("" + treeSet2);

    }
}
