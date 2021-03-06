package com.blogspot.mstachniuk.java8examples.ex01;

import java.util.List;
import java.util.function.Predicate;

public class NameFinderLambda {

    public String findNameByComplicatedCondition(List<String> names) {
        Predicate<String> femaleNamePredicate = name -> {
            System.out.println("female Name Predicate " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return name.endsWith("a");
        };

        return names.stream()
                .filter(femaleNamePredicate)
                .filter(name -> name.length() > 5)
                .filter(name -> name.length() < 8)
                .filter(name -> name.startsWith("c") || name.startsWith("C"))
                .findFirst()
                .map(String::toLowerCase)
                .map(name -> ("" + name.charAt(0)).toUpperCase() + name.substring(1, name.length()))
                .get();
    }
}
