package com.vkstech.rough;

public class SingletonDemo {

    private static SingletonDemo INSTANCE;

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDemo();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();

        System.out.println(s1 == s2);
    }
}
