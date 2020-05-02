package com.yazykov.task_4;

import java.util.Scanner;

public class TextAnalyzingTest {
    public static void main(String[] args){
        System.out.println("Please enter text:");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        System.out.println("Please enter word for find:");
        String word = in.nextLine();

        try{
            System.out.println("This word is contained in text: " + TextAnalyzing.getCountWord(text, word)+ " times");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
