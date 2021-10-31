package com.vkstech.rough;

public class ImmutableDemo {

    private final int i;

    public ImmutableDemo(int i){
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public ImmutableDemo add(int i) {
        return new ImmutableDemo(this.i + i);
    }

    public static void main(String[] args) {
        ImmutableDemo i1 = new ImmutableDemo(1);
        ImmutableDemo i2 = i1;
        i1 = i1.add(2);
        System.out.println(i1.getI());
        System.out.println(i2.getI());
        System.out.println(i1 == i2);
    }
}
