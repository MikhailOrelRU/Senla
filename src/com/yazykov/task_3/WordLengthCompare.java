package com.yazykov.task_3;

import java.util.Comparator;

public class WordLengthCompare implements Comparator<String> {

    public int compare(String s1, String s2){

        return ((Integer) s1.length()).compareTo((Integer) s2.length());
    }

}
