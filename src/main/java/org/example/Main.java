package org.example;

import org.example.BinaryTree.BinaryTree;
import org.example.Utility.MyLinkedList;
import org.example.Utility.MyStack;
import org.example.Utility.MyQueue;


public class Main {
    public static void main(String[] args) {
        System.out.println("======= \t EXERCISE DAY 10 \t=======");
        testLinkedList();
        testStack();
        testQueue();
        BinaryTree.main();
    }

    static void testLinkedList() {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.toString());
    }

    static void testStack() {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements:");
        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack elements after pop:");
        stack.display();

        System.out.println("Stack size: " + stack.getSize());
    }

    static void testQueue() {

        MyQueue queue = new MyQueue();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue after removal: " + queue);

        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);
    }
}