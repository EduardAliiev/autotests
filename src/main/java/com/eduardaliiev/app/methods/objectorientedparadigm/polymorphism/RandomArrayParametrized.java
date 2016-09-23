package com.eduardaliiev.app.methods.objectorientedparadigm.polymorphism;

public class RandomArrayParametrized extends RandomArrayCreator {

    private int[] overridenArrayOne;
    private int[][]overridenArrayTwo;

    public RandomArrayParametrized(int[]overridenArrayOne, int[][] overridenArrayTwo){
        this.overridenArrayOne = overridenArrayOne;
        this.overridenArrayTwo = overridenArrayTwo;
    }


    @Override
    public int[] getOverrideOne(){
        return overridenArrayOne = null;
    }

    @Override
    public int[][] getOverrideTwo(){
        return overridenArrayTwo = null;
    }
}
