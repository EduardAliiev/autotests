package com.eduardaliiev.app.methods.objectorientedparadigm.polymorphism.bicycle;

public abstract class CustomBicycle extends Bicycle {
    Bicycle bicycle = new CustomBicycle() {
        @Override
        public String setGear() {               //Вызвать методы setGear() и ride() из обьекта класса CustomBicycle через референс класса Bicycle.
            return null;
        }

        @Override
        public void ring() {
            System.out.println("\"Wshhhh!\"");
        }
    };

    Integer speed = Integer.valueOf(setSpeed());            //преобразовываем String в int
    Integer gear = Integer.valueOf(setGear());             //преобразовываем String в int

    @Override                           //имплементируем
    public String setSpeed() {
        System.out.println(speed + " ");
        return null;
    }

    @Override                           //имплементируем
    public String setGear() {
        System.out.println(gear + " ");
        return null;
    }

    public abstract void ring();
}
