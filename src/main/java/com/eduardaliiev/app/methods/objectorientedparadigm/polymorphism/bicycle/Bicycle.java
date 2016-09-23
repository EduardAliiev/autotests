package com.eduardaliiev.app.methods.objectorientedparadigm.polymorphism.bicycle;

public abstract class Bicycle {
    public abstract String setSpeed();
    public abstract String setGear();

    public static void ride() {
        System.out.println("\"Wroom!\"");}
}
