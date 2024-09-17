package org.example.BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    public static void main() {
        TreeNode bst = new TreeNode();
        Scanner scanner = new Scanner(System.in);

        int n = Utils.scanInt(scanner, "Enter the number of elements to insert : ");
        for (int i = 0; i < n; i++) {
            int element = Utils.scanInt(scanner, "Enter the elements : ");
            bst.insert(element);
        }

        System.out.println("In-order traversal of the BST:");
        bst.inorder();

        int number = Utils.scanInt(scanner,"Enter a number to search : ");
        if (bst.search(number)) {
            System.out.println(number + " found in the BST.");
        } else {
            System.out.println(number + " not found in the BST.");
        }

        scanner.close();
    }
}
