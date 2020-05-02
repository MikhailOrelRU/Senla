package com.yazykov.task_3;

import java.util.Comparator;

public class NotCaseWordsCompare implements Comparator<String> {
    public int compare(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        return s1.compareTo(s2);
    }
}
