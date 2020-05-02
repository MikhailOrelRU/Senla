package com.yazykov.task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzing {

    static int getCountWord(String text, String word){

        if(word.equals("") || text.equals("")) throw new IllegalArgumentException("Ошибка ввода");

        text = text.toLowerCase();
        word = word.toLowerCase();

        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher1 = pattern.matcher(text);
        int count = 0;

        while(matcher1.find()){
            count++;
        }

        return count;
    }
}
