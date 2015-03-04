package com.blogspot.mstachniuk.java8examples.ex01;

import java.util.List;

public class NameFinderOld {

    /**
     * Find female name,
     * longer than 5
     * shorter Than 8
     * begin On C
     * And return it with first upper case and other lower case
     */
    public String findNameByComplicatedCondition(List<String> names) {
        for (String name : names) {
            if(name.endsWith("a") && name.length() > 5 && name.length() < 8
                    && (name.startsWith("C") || name.startsWith("c"))) {
                String lowerCaseName = name.toLowerCase();
                return ("" + lowerCaseName.charAt(0)).toUpperCase() + lowerCaseName.substring(1, lowerCaseName.length());
            }
        }
        return "";
    }
}
