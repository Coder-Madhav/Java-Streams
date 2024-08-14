package com.codermadhav.streams;

import lombok.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest {
    public static void main(String[] args) {
        System.out.println(convertFirstLetterToCapital("my name is madhava ponnana"));

        String[] strArray = {"india", "australia", "england", "srilanka", "usa", "uk"};
        List result = findStrings(strArray);
        System.out.println(result);
        System.out.println("=====================");

        System.out.println(printUniqueChars("welcome"));
        System.out.println(printUniqueChars("hello"));

        System.out.println("=====================");

        List<Integer> resultList = mergeTwoLists(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(3, 4, 5, 6, 7, 8));
        System.out.println(resultList);

        System.out.println("Unique Elements: ");
        System.out.println(removeDuplicates(resultList));

        System.out.println("To use set..........");
        System.out.println(printUniques(resultList));

        System.out.println("Sum of All Elements in Array: ");
        System.out.println(sumOfAllElements(new int[]{2, 3, 4, 5, 7}));

        List<Employee> employeeList = Employee.getEmployeeDatabase();

        System.out.println("Fetching top 3 salaried employees: ");
        System.out.println(fetchTopThreeSalaries(employeeList));

        System.out.println("print employees in descending order based on employee salary:");
        System.out.println(sortingEmployeesBasedOnSalaryDESC(employeeList));

        System.out.println("Employees having salary less than 3rd height salary....");
        System.out.println(fetchAllEmployeesHavingSalaryLessThanThirdHeightSalary(employeeList));

        System.out.println(replacingSpecifiedCharAtIndex("Eelcome to java"));

        System.out.println(sortElements(Arrays.asList("AA", "ZZ", "CC", "FF")));

    }

    public static List<String> sortElements(List<String> list) {
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }

    public static String replacingSpecifiedCharAtIndex(String input) {
        int index = 0;
        char ch = 'w';

        StringBuilder sb = new StringBuilder(input);
        sb.setCharAt(index, ch);
        return sb.toString();
    }

    public static int sumOfAllElements(int[] arr) {
        return Arrays.stream(arr).reduce(0, (a, b) -> a + b);
    }

    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
//        return Stream.of(list1, list2).toList().stream().flatMap(l -> l.stream()).toList();
        return Stream.concat(list1.stream(), list2.stream()).toList();
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        /*Set<Integer> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());*/
        return list.stream().distinct().toList();
    }

    public static Set<Integer> printUniques(List<Integer> list) {
        return list.stream().collect(Collectors.toSet());
    }

    public static String printUniqueChars(String input) {
        String result = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey() + "").collect(Collectors.joining(""));
        return result;
    }

    public static String convertFirstLetterToCapital(String input) {
        String collect = Arrays.stream(input.split(" ")).map(s -> s.substring(0, 1).toUpperCase().concat(s.substring(1))).collect(Collectors.joining(" "));
        return collect;
    }

    public static List findStrings(String[] strArray) {
        List<String> list = Arrays.stream(strArray).filter(s -> s.length() > 5).toList();
        return list;
    }


    public static List<Employee> fetchTopThreeSalaries(List<Employee> empList) {
        return empList.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary()).limit(3).toList();
    }

    public static List<Employee> sortingEmployeesBasedOnSalaryDESC(List<Employee> empList) {
        return empList.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary()).toList();
    }

    public static List<Employee> fetchAllEmployeesHavingSalaryLessThanThirdHeightSalary(List<Employee> empList) {
        return empList.stream()
                .sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
                .skip(3)
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .toList();
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Employee {
    private int id;
    private int salary;

    public static List<Employee> getEmployeeDatabase() {
        return Arrays.asList(
                Employee.builder().id(1).salary(500).build(),
                Employee.builder().id(2).salary(1000).build(),
                Employee.builder().id(3).salary(1500).build(),
                Employee.builder().id(4).salary(2000).build(),
                Employee.builder().id(5).salary(2500).build(),
                Employee.builder().id(6).salary(3000).build(),
                Employee.builder().id(7).salary(3500).build()
        );
    }

}
