package com.dataStructures.Algorithems.stream;


import lombok.ToString;

@ToString
public class Employee {



    private int id;
    private int salary;
    private  String name;

    public Employee(int i, int i1, String name) {
        this.id=i;
        this.salary=i1;
        this.name=name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
