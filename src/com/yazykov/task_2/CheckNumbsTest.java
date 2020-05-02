package com.yazykov.task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNumbsTest {
    public static void checkNumbers(long a, long b) {
        try {
            System.out.printf("НОД чисел %s и %s равен %s.\n", a, b, CheckNumbs.gcd(a, b));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.printf("НОК чисел %s и %s равен %s.\n", a, b, CheckNumbs.lcm(a, b));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long numOne = 0;
        long numTwo = 0;
        System.out.println("Введите два целых числа: ");
        try {
            numOne = scanner.nextLong();
            numTwo = scanner.nextLong();
            checkNumbers(numOne, numTwo);
        }catch (InputMismatchException e){
            System.out.println("Ошибка ввода: не является целым числом");
        }
    }
}
