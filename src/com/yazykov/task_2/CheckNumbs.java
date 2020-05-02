package com.yazykov.task_2;

public class CheckNumbs {

    //���������� ���������� ����� �������� ���� ����� �����
    public static long gcd(long a, long b){
        if(a == 0 && b == 0) throw new IllegalArgumentException("���(0,0) - �� ����������");

        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0){
            return a;
        }else {
            return gcd(b, a % b);
        }
    }

    //���������� ���������� ����� ������� ���� ����� �����
    public static long lcm(long a,long b) {
        if(a == 0 || b == 0) throw new IllegalArgumentException("���(0,x) - �� ����������");

        a = Math.abs(a);
        b = Math.abs(b);

        return a / gcd(a,b) * b;

    }
}
