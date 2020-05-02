package com.yazykov.task_3;

import java.util.List;
import java.util.Scanner;

public class StringAnalyzingTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("������� ������: ");
        String lane = in.nextLine();

        //����� � ����� ��������� �������
        //List<String> listWords = StringAnalyzing.toArrayListWordsAndNumbers(lane);

        List<String> listWords = StringAnalyzing.toArrayListWords(lane);
        System.out.print("���������� ����: ");
        System.out.println(StringAnalyzing.wordsCount(listWords));
        System.out.println("������ ����� ������� ����� ���������:");
        System.out.println(StringAnalyzing.toUpperCaseFirstLetter(lane));
        System.out.println("���������� � ������� �����������, �������� ������������ ������� ����:");
        System.out.println(StringAnalyzing.sortClassic(listWords));
        System.out.println("���������� ��� ����� ��������");
        System.out.println(StringAnalyzing.sortWordsNotCase(listWords));
        System.out.println("���������� �� ���������� ���� � �����:");
        System.out.println(StringAnalyzing.sortWordsForLength(listWords));
    }
}
