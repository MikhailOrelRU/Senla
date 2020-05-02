package com.yazykov.task_4;

import java.util.Scanner;

public class TextAnalyzingTest {
    public static void main(String[] args){
        System.out.println("������� �����:");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        System.out.println("������� ����� ��� ������:");
        String word = in.nextLine();

        try{
            System.out.println("������� ����� �����������: " + TextAnalyzing.getCountWord(text, word)+ " ���(�)");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
