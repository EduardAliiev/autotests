package com.eduardaliiev.utils.arrays.objectorientedparadigm.polymorphism.bicycle;

public class BicycleWithRing extends CustomBicycle {
    BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRingInterface() {
        @Override
        public void ring() {
            System.out.println("\"Di-ling!\"");
        }
    };

    @Override
    public void ring() {
    }

    public interface BicycleWithRingInterface {
        void ring();
    }
}

