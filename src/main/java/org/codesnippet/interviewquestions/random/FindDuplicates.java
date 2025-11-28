package org.codesnippet.interviewquestions.random;

import java.util.HashSet;
import java.util.Set;

//Find duplicates in an array
public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 5, 3, 1};

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }

        System.out.println(duplicates);
    }
}
