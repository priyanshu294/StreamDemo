package org.codesnippet.interviewquestions.random;
import java.util.*;
import java.util.stream.*;

public class SumOfAll {
    public static void main(String[] args) {

        // Create list and add numbers from 1 to 5
        List<Integer> element = Arrays.asList(1, 2, 3, 4, 5);

        // Find sum using stream
        int sum = element.stream()
                .mapToInt(i -> i)
                .sum();

        System.out.println("Sum = " + sum);
}
}
