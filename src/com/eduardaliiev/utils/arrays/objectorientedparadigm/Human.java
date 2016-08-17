package com.eduardaliiev.utils.arrays.objectorientedparadigm;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {           // constructor
        this.name = name;
        this.age = age;
    }
    public Human() {
        this.name = "Gomer";                        // no-args constructor
        this.age = 38;
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
        if (age <= 0 || age >= 121) {
            System.out.println("Human age is " + age + "\nAge invalid :(");
        } else {
            this.age = age;
            System.out.println("Human age is " + age + "\nNew age setted!");
        }
    }
}
