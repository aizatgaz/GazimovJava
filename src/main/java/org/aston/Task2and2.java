package org.aston;

import java.util.Scanner;

/**
 * Задание 2.2
 */

public class Task2and2 {

    public static void main(String[] args) {
        compare();
    }

    public static void compare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку a:");
        String a  = scanner.nextLine();
        System.out.println("Введите строку b:");
        String b  = scanner.nextLine();

        System.out.println(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");
    }

}
