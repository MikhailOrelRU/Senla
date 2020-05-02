package com.yazykov.task_2;

public class CheckNumbs {

    //возвращает наибольщий общий делитель двух целых чисел
    public static long gcd(long a, long b){
        if(a == 0 && b == 0) throw new IllegalArgumentException("НОД(0,0) - не существует");

        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0){
            return a;
        }else {
            return gcd(b, a % b);
        }
    }

    //возвращает наименьшее общее кратное двух целых чисел
    public static long lcm(long a,long b) {
        if(a == 0 || b == 0) throw new IllegalArgumentException("НОК(0,x) - не существует");

        a = Math.abs(a);
        b = Math.abs(b);

        return a / gcd(a,b) * b;

    }
}
