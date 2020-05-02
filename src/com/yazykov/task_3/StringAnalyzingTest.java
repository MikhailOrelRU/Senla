package com.yazykov.task_3;

import java.util.List;
import java.util.Scanner;

public class StringAnalyzingTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String lane = in.nextLine();

        //Буквы и цифры считаются словами
        //List<String> listWords = StringAnalyzing.toArrayListWordsAndNumbers(lane);

        List<String> listWords = StringAnalyzing.toArrayListWords(lane);
        System.out.print("Количество слов: ");
        System.out.println(StringAnalyzing.wordsCount(listWords));
        System.out.println("Первая буква каждого слова заглавная:");
        System.out.println(StringAnalyzing.toUpperCaseFirstLetter(lane));
        System.out.println("Сортировка в порядке возрастания, учитывая естественный порядок слов:");
        System.out.println(StringAnalyzing.sortClassic(listWords));
        System.out.println("Сортировка без учета регистра");
        System.out.println(StringAnalyzing.sortWordsNotCase(listWords));
        System.out.println("Сортировка по количеству букв в слове:");
        System.out.println(StringAnalyzing.sortWordsForLength(listWords));
    }
}
