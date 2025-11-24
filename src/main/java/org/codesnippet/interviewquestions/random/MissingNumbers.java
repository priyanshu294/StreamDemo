package org.codesnippet.interviewquestions.random;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Print all missing numbers in a range
public class MissingNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 4, 7, 9);

        Set<Integer> set = new HashSet<>(list);

        int start = 1;
        int end = 10;

        List<Integer> missing  = IntStream.rangeClosed(start, end)
                .filter(n -> !set.contains(n))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(missing);
    }
}
