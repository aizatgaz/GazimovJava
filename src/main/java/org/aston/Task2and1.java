package org.aston;

import java.util.Scanner;

/**
 * Задание 2.1
 */
public class Task2and1 {
    public static void main(String[] args) {
        comparisonBAndA();
    }

    public static void comparisonBAndA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a  = scanner.nextInt();
        System.out.println("Введите число b:");
        int b  = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else System.out.println("a = b");

        int plus = a + b;
        System.out.println(plus);

        int minus = a - b;
        System.out.println(minus);

        int divide = a / b;
        System.out.println(divide);

        int multiply = a * b;
        System.out.println(multiply);
    }
}
