package org.codesnippet.interviewquestions.random;

//Reverse each word in a sentence
public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Hello World";

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word: words){
            result.append(new StringBuilder(word).reverse());
            result.append(" ");
        }
        System.out.println(result);
    }
}
