package org.example.Utility;

public class MyLinkedList {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int index) {
        if (index >= size()) {
            throw new RuntimeException("Index out of bound.");
        }
        Node current = this.head;
        if (index == 0) {
            this.head = current.next;
        } else {
            Node previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
    }

    public int get(int index) {
        if (index >= size()) {
            throw new RuntimeException("Index out of bound.");
        }
        if (index == 0) {
            return this.head.data;
        } else {
            Node current = this.head;
            int i = 1;
            while (i <= index) {
                current = current.next;
                i++;
            }
            return current.data;
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = this.head;
        if (current != null) {
            sb.append("[");
            while (current != null) {
                sb.append(current.data);
                if (!current.isLast()) {
                    sb.append(",");
                } else {
                    sb.append("]");
                }
                current = current.next;
            }
        } else {
            sb.append("[]");
        }

        return sb.toString();
    }
}
