package com.blogspot.mstachniuk.java8examples.ex01;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NameFinderLambda {

    public String findNameByComplicatedCondition(List<String> names) {
        Predicate<String> femaleNamePredicate = name -> {
            System.out.println("female Name Predicate " + name);
            return name.endsWith("a");
        };

        final Stream<String> temp = names.stream()
                .filter(femaleNamePredicate)
                .filter(name -> name.length() > 5)
                .filter(name -> name.length() < 8)
                .filter(name -> name.startsWith("c") || name.startsWith("C"));
        return temp
                .findFirst()
                .map(String::toLowerCase)
                .map(name -> ("" + name.charAt(0)).toUpperCase() + name.substring(1, name.length()))
                .get();
    }
}
