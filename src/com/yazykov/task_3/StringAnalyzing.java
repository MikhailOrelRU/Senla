package com.yazykov.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAnalyzing {
    public static String toUpperCaseFirstLetter(String lane) {
        StringBuilder builder = new StringBuilder(lane);
        if (Character.isAlphabetic(lane.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(lane.charAt(0)));

        for (int i = 1; i < lane.length(); i++)
            if (Character.isAlphabetic(lane.charAt(i)) && Character.isSpaceChar(lane.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(lane.charAt(i)));

        return builder.toString();
    }

    //return list of words contain letters and numbers
    public static List<String> toArrayListWordsAndNumbers(String lane){
        if(lane.equals("")) throw new IllegalArgumentException("Error input");

        List<String> listWords = new ArrayList();
        Pattern pattern = Pattern.compile("\\b[\\p{L}\\p{N}\\-']+\\b");
        Matcher matcher = pattern.matcher(lane);
        while(matcher.find()){
            listWords.add(matcher.group());
        }
        return listWords;
    }
    //return list of words contain letters
    public static List<String> toArrayListWords(String lane){
        if(lane.equals("")) throw new IllegalArgumentException("Error input");

        List<String> listWords = new ArrayList();
        Pattern pattern = Pattern.compile("\\b[\\p{L}\\-']+\\b");
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

    //sort list of words case-insensitive
    public static List<String> sortWordsNotCase(List<String> listWords){
        Collections.sort(listWords, new NotCaseWordsCompare());
        return listWords;
    }

    //sort by word size
    public static List<String> sortWordsForLength(List<String> listWords){
        Collections.sort(listWords,new WordLengthCompare());
        return listWords;
    }
}
