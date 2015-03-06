package com.blogspot.mstachniuk.java8examples.ex00;

public class SomeClass {

    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @FunctionalInterface
    interface Listener {
        void executeSomeAction(String event);
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.setListener(event -> System.out.println(event));
    }
}
