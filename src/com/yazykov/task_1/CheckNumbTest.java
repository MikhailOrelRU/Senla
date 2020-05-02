package com.yazykov.task_1;

import java.util.Scanner;

public class CheckNumbTest {
    public static void numberCheck(int num){
        String s1 = "";
        String s2 = "";

        if(CheckNumb.isEven(num)){
            s1 = "четным";
        }else  s1= "нечетным";

        try {
            if(CheckNumb.isPrime(num)){
                s2 = "простым";
            } else  s2 = "составным";
        }catch (IllegalArgumentException e){
            s2 = e.getMessage();
        }
        System.out.printf("Число - %s является: %s, %s.\n", num, s1, s2);
    }

    public static void main(String[] args){

        //Вариант 1 чтения с консоли
        System.out.print("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numberCheck(num);
        } else  System.out.println("Ошибка ввода: не является целым числом");

        /*
        //Вариант 2 чтения с консоли без выхода при ошибочном вводе
        try {
            int numb = ReadConsole.numberReadWhyle();
            numberCheck(numb);
        }catch (ExitException ex){
            System.out.println(ex.getMessage());
        }
        */
    }
}
