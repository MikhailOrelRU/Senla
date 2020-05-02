package com.yazykov.task_5;

public class CheckNumb {
    public static boolean isPalindrome(int i){
        int temp = i;
        int next = 0;

        while(temp != 0){
            next = next*10 + temp%10;
            temp /= 10;
        }

        return i == next;
    }
}
