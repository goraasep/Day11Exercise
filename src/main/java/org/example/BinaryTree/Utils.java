package org.example.BinaryTree;

import java.util.Scanner;

public class Utils {
    static int scanInt(Scanner scanner, String text) {
        System.out.print(text);
        scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input is not integer.");
            return scanInt(scanner, text);
        }
    }
}
