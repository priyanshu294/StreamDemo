package org.codesnippet.interviewquestions.random;
import java.util.*;
import java.util.stream.*;

public class Alphanumeric {
    public static void main(String[] args) {

        String input = "a4b1c9d2z7";

        List<Integer> result =
                input.chars()                           // get IntStream of characters
                        .filter(Character::isDigit)         // keep only digits
                        .mapToObj(c -> Character.getNumericValue((char)c)) // convert char → int
                        .sorted(Comparator.reverseOrder())  // sort in descending order
                        .collect(Collectors.toList());      // collect result

        System.out.println(result); // [9, 7, 4, 2, 1]
}
}
