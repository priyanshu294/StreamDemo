package org.codesnippet.interviewquestions.random;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the first repeating character in a string
public class FirstRepeatingChar {
    public static void main(String[] args) {

        String str = "abca";

        Character firstRepeating = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))

                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(firstRepeating);

    }
}
