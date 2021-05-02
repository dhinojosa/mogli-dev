package com.xyzcorp;

public class Box<A> {
    private final A value;

    public Box(A value) {
        this.value = value;
    }

    public A value() {
        return value;
    }
}
