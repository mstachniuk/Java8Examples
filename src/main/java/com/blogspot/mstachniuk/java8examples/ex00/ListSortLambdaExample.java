package com.blogspot.mstachniuk.java8examples.ex00;

import java.util.Arrays;
import java.util.List;

public class ListSortLambdaExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 6, 7, 2, 4, 3);

        numbers.sort((n1, n2) -> n2 - n1);

        System.out.println(numbers);
    }
}
