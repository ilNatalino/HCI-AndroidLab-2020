package com.gdacciaro.esercizio1;

import java.io.Serializable;

public class Employee implements Serializable {
    private final String name;
    private final Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
