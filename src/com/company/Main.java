package com.company;



public class Main {

    public static void main(String[] args) {
        Bag<Double, Integer> bag1 = new Bag<>(2.5, 5);
        Bag<Float, Integer> bag2 = new Bag<>(6f, 6);
        System.out.println("Первый сумма: " + addition(bag1, bag2));
        System.out.println("Второй сумма: " + multiplication(bag1, bag2));



    }

    public static Number addition(Bag<? extends Number,? extends Number> bag1,
                                  Bag<? extends Number, ? extends Number> bag2){
       return bag1.getThings1().doubleValue() + bag1.getThings1().doubleValue()
       + bag2.getThings2().doubleValue() + bag2.getThings2().doubleValue();
    }

    public static Number multiplication(Bag<? extends Number, ? extends  Number> bag1,
                                        Bag<? extends Number, ? extends Number> bag2){
        return bag1.getThings1().doubleValue() + bag1.getThings1().doubleValue() +
                bag2.getThings2().doubleValue() + bag2.getThings2().doubleValue();
    }
}
