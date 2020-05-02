package com.yazykov.task_1;

import java.util.Scanner;

public class CheckNumbTest {
    public static void numberCheck(int num){
        String s1 = "";
        String s2 = "";

        if(CheckNumb.isEven(num)){
            s1 = "even";
        }else  s1= "odd";

        try {
            if(CheckNumb.isPrime(num)){
                s2 = "prime";
            } else  s2 = "composite";
        }catch (IllegalArgumentException e){
            s2 = e.getMessage();
        }
        System.out.printf("Number - %s is: %s, %s.\n", num, s1, s2);
    }

    public static void main(String[] args){

        //Var 1
        System.out.print("Enter integer number: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numberCheck(num);
        } else  System.out.println("Input error");

/*
        //Var2 read from console
        try {
            int numb = ReadConsole.numberReadWhyle();
            numberCheck(numb);
        }catch (ExitException ex){
            System.out.println(ex.getMessage());
        }*/

    }
}
