package com.yazykov.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAnalyzing {
    public static String toUpperCaseFirstLetter(String lane) {
        StringBuilder builder = new StringBuilder(lane);
        //устанавливаем первый символ заглавным, если это буква
        if (Character.isAlphabetic(lane.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(lane.charAt(0)));

        //крутимся в цикле, и устанавливаем заглавные буквы, перед которыми находится пробел
        for (int i = 1; i < lane.length(); i++)
            if (Character.isAlphabetic(lane.charAt(i)) && Character.isSpaceChar(lane.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(lane.charAt(i)));

        return builder.toString();
    }

    //возвращает список слов состоящих из букв(рус, анг) и цифр
    public static List<String> toArrayListWordsAndNumbers(String lane){
        List<String> listWords = new ArrayList();
        Pattern pattern = Pattern.compile("\\b[а-яА-Я\\w\\-']+\\b");
        Matcher matcher = pattern.matcher(lane);
        while(matcher.find()){
            listWords.add(matcher.group());
        }
        return listWords;
    }
    //возвращает список слов состоящих из букв(рус, анг)
    public static List<String> toArrayListWords(String lane){
        List<String> listWords = new ArrayList();
        Pattern pattern = Pattern.compile("\\b[а-яА-Яa-zA-z\\-']+\\b");
        Matcher matcher = pattern.matcher(lane);
        while(matcher.find()){
            listWords.add(matcher.group());
        }
        return listWords;
    }

    public static int wordsCount(List<String> listWords){
        return listWords.size();
    }

    public static List<String> sortClassic(List<String> listWords){
        Collections.sort(listWords);
        return listWords;
    }

    //сортирует список слов без учета регистра
    public static List<String> sortWordsNotCase(List<String> listWords){
        Collections.sort(listWords, new NotCaseWordsCompare());
        return listWords;
    }

    //сортирует список слов по количеству букв в слове
    public static List<String> sortWordsForLength(List<String> listWords){
        Collections.sort(listWords,new WordLengthCompare());
        return listWords;
    }
}
