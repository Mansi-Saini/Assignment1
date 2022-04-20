package org.example;

import java.util.List;

public class Employee {
    private String name;
    private int age;
    private Address address;
    private List<String> number;

    public Employee(String name, int age, Address address, List<String> number) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.number = number;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getNumber() {
        return number;
    }

    public void setNumber(List<String> number) {
        this.number = number;
    }
}
