package com.yazykov.task_4;

import java.util.Scanner;

public class TextAnalyzingTest {
    public static void main(String[] args){
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        System.out.println("Введите слово для поиска:");
        String word = in.nextLine();

        try{
            System.out.println("Искомое слово встречается: " + TextAnalyzing.getCountWord(text, word)+ " раз(а)");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
