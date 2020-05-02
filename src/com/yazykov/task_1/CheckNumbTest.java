package com.yazykov.task_1;

import java.util.Scanner;

public class CheckNumbTest {
    public static void numberCheck(int num){
        String s1 = "";
        String s2 = "";

        if(CheckNumb.isEven(num)){
            s1 = "������";
        }else  s1= "��������";

        try {
            if(CheckNumb.isPrime(num)){
                s2 = "�������";
            } else  s2 = "���������";
        }catch (IllegalArgumentException e){
            s2 = e.getMessage();
        }
        System.out.printf("����� - %s ��������: %s, %s.\n", num, s1, s2);
    }

    public static void main(String[] args){

        //������� 1 ������ � �������
        System.out.print("������� ����� �����: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numberCheck(num);
        } else  System.out.println("������ �����: �� �������� ����� ������");

        /*
        //������� 2 ������ � ������� ��� ������ ��� ��������� �����
        try {
            int numb = ReadConsole.numberReadWhyle();
            numberCheck(numb);
        }catch (ExitException ex){
            System.out.println(ex.getMessage());
        }
        */
    }
}
