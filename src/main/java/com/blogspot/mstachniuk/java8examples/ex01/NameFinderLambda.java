package com.blogspot.mstachniuk.java8examples.ex01;

import java.util.List;

public class NameFinderLambda {

    public String findNameByComplicatedCondition(List<String> names) {
        return names.stream()
                .filter(name -> name.endsWith("a"))
                .filter(name -> name.length() > 5)
                .filter(name -> name.length() < 8)
                .filter(name -> name.startsWith("c") || name.startsWith("C"))
                .findFirst()
                .map(String::toLowerCase)
                .map(name -> ("" + name.charAt(0)).toUpperCase() + name.substring(1, name.length()))
                .get();
    }
}
