package com.yazykov.task_1;

import java.math.BigInteger;

public class CheckNumb {

    public static boolean isEven(int num){
        if( num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int num){
        if(num  <= 1) throw new IllegalArgumentException("не входит в множество простых(составных) чисел");
        BigInteger bigInteger = BigInteger.valueOf(num);
        if (bigInteger.isProbablePrime(num)){
            return true;
        } else {
            return false;
        }
    }
}
