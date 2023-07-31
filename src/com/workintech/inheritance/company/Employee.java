package com.workintech.inheritance.company;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(long id,String name){ //hoca ekledi.
        this.id=id;
        this.name=name;
    }
    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary= salary < 0 ? 0: salary;
    }
    public void work() {
        System.out.println(name + " Starts to working.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append (" Id "  + id);
        builder.append (" Name " + name);
        return builder.toString();
    }
}
