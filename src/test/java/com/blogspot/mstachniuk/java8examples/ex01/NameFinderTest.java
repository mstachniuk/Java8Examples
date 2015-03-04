package com.blogspot.mstachniuk.java8examples.ex01;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class NameFinderTest {

    private NameFinderOld nameFinderOld = new NameFinderOld();
    private NameFinderGuava nameFinderGuava = new NameFinderGuava();
    private NameFinderLambda nameFinderLambda = new NameFinderLambda();

    private List<String> names = asList("Marcin", "Anna", "JAN", "grzegorz", "aleksandra", "kunegunda", "ceCYLia", "Celina", "CzeSŁawa");

    @Test
    public void shouldFindNameWithOldMethod() {
        String result = nameFinderOld.findNameByComplicatedCondition(names);
        assertThat(result).isEqualTo("Cecylia");
    }

    @Test
    public void shouldFindNameWithGuava() {
        System.out.println("Should Find Name With Guava -------");
        String result = nameFinderGuava.findNameByComplicatedCondition(names);
        assertThat(result).isEqualTo("Cecylia");
    }

    @Test
    public void shouldFindNameWithLambda() {
        System.out.println("Should Find Name With Lambda -------");
        Stopwatch stopwatch = Stopwatch.createStarted();
        String result = nameFinderLambda.findNameByComplicatedCondition(names);
        System.out.println("Execution time: " + stopwatch);
        assertThat(result).isEqualTo("Cecylia");
    }


}