package com.blogspot.mstachniuk.java8examples.ex01;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

import java.util.List;

public class NameFinderGuava {

    private Predicate<String> femaleNamePredicate = new Predicate<String>() {
        @Override
        public boolean apply(String input) {
            return input.endsWith("a");
        }
    };

    private Predicate<String> longerThan5Predicate = new Predicate<String>() {
        @Override
        public boolean apply(String input) {
            return input.length() > 5;
        }
    };

    private Predicate<String> shorterThan8Predicate = new Predicate<String>() {
        @Override
        public boolean apply(String input) {
            return input.length() < 8;
        }
    };

    private Predicate<String> startWithCPredicate = new Predicate<String>() {
        @Override
        public boolean apply(String input) {
            return input.startsWith("c") || input.startsWith("C");
        }
    };

    private Function<String, String> allToLowerCase = new Function<String, String>() {
        @Override
        public String apply(String input) {
            return input.toLowerCase();
        }
    };

    private Function<String, String> firstToUpperCase = new Function<String, String>() {
        @Override
        public String apply(String input) {
            return ("" + input.charAt(0)).toUpperCase() + input.substring(1, input.length());
        }
    };

    public String findNameByComplicatedCondition(List<String> names) {
        return FluentIterable.from(names)
                .filter(femaleNamePredicate)
                .filter(longerThan5Predicate)
                .filter(shorterThan8Predicate)
                .filter(startWithCPredicate)
                .first()
                .transform(allToLowerCase)
                .transform(firstToUpperCase)
                .get();
    }
}
