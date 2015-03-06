package com.blogspot.mstachniuk.java8examples.ex02;

public interface Person {

    String getSurname();
    String getLastName();

    default String getFullName() {
        return getSurname() + " " + getLastName();
    }

    static int getId() {
        return 42;
    }
}
