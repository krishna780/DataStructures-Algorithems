package com.dataStructures.Algorithems.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40));
        List<Person>  personList = persons.stream().filter(p -> "jack".equals(p.getString())
                && p.getNum() == 20).collect(Collectors.toList());
        double num1 = 5.5;
        List<Person> staff = Arrays.asList(
        new Person("mkyong", 30, new BigDecimal(num1)),
                new Person("jack", 27, new BigDecimal(20000)),
                new Person("lawrence", 33, new BigDecimal(30000))
        );
        System.out.println(8.55/100);

    }

    @NoArgsConstructor
    @Data
    private static class Person {
        private String string;
        private int  num;
        private BigDecimal salary;

        public Person(String string, int num) {
            this.string = string;
            this.num = num;
        }

        public Person(String string, int num, BigDecimal salary) {
            this.string = string;
            this.num = num;
            this.salary = salary;
        }
    }
}
