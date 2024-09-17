package org.example.Utility;

public class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    boolean isLast() {
        if (this.next == null) {
            return true;
        } else {
            return false;
        }
    }
}
