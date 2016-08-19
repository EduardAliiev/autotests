package com.eduardaliiev.utils.arrays.objectorientedparadigm;

public class Human {
    private String name;
    private int age;
    private String position;

    public Human(String name, int age) {           // constructor
        this.name = name;
        this.age = age;
    }

    public Human() {
        this.name = "Homer Jay Simpson";                        // no-args constructor
        this.age = 38;
        this.position = "Safety Inspector at the Springfield Nuclear Power Plant";
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
            System.out.println("\nHuman age is " + age + "\nNew age setted!");
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
