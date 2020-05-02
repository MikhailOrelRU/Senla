package com.yazykov.task_2;

public class CheckNumbs {

    //return greatest common divisor 2 integer numbers
    public static long gcd(long a, long b){
        if(a == 0 && b == 0) throw new IllegalArgumentException("GCD(0,0) - not exist");

        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0){
            return a;
        }else {
            return gcd(b, a % b);
        }
    }

    //least common multiple 2 integer numbers
    public static long lcm(long a,long b) {
        if(a == 0 || b == 0) throw new IllegalArgumentException("LCM(0,õ) - not exist");

        a = Math.abs(a);
        b = Math.abs(b);

        return a / gcd(a,b) * b;

    }
}
