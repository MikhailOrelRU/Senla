package com.yazykov.task_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNumbTest {
    public static void main(String[] args) {
        System.out.println("Введите длину последовательности в интервале (0; 100]: ");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            n = scanner.nextInt();
            if (n > 0 & n <= 100) {
                System.out.printf("Числа палиндромы в последовательности (0, %s]:\n",n);
                for (int i = 1; i < n + 1; i++) {
                    if (CheckNumb.isPalindrome(i)) System.out.print(i + " ");
                }
            } else System.out.println("Ошибка: необходимо ввести последовательность в интервале (0; 100]");

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
