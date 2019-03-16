package com.netcracker.employee;

import java.util.Objects;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String secondName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = secondName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }


    public String getName() {
        return firstName + " " + lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percent) {
        salary *= salary*percent/100;
        return salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return employee.id == id && employee.firstName.equals(this.firstName) &&
                employee.lastName.equals(this.lastName) && employee.salary == this.salary;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + id;
        result = 31 * result + salary;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
