package com.yazykov.task_3;

import java.util.List;
import java.util.Scanner;

public class StringAnalyzingTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter string: ");
        String lane = in.nextLine();

        try {
            //letters and numbers is words
            //List<String> listWords = StringAnalyzing.toArrayListWordsAndNumbers(lane);
            List<String> listWords = StringAnalyzing.toArrayListWords(lane);
            System.out.print("Sum words: ");
            System.out.println(StringAnalyzing.wordsCount(listWords));
            System.out.println("First letter every word in upperCase:");
            System.out.println(StringAnalyzing.toUpperCaseFirstLetter(lane));
            System.out.println("Sorts the specified list into ascending order, according to the natural ordering of its elements:");
            System.out.println(StringAnalyzing.sortClassic(listWords));
            System.out.println("Sort case-insensitive:");
            System.out.println(StringAnalyzing.sortWordsNotCase(listWords));
            System.out.println("Sort by word size:");
            System.out.println(StringAnalyzing.sortWordsForLength(listWords));
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }
}
