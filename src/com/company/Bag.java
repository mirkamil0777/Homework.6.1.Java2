package com.company;

public class Bag<E extends Number, T extends Number> implements Bagable <T> {
    E things1;
    T things2;

    public E getThings1() {
        return things1;
    }

    public void setThings1(E things1) {
        this.things1 = things1;
    }

    public T getThings2() {
        return things2;
    }

    public void setThings2(T things2) {
        this.things2 = things2;
    }


    public Bag(E things1, T things2) {
        this.things1 = things1;
        this.things2 = things2;
    }
}
