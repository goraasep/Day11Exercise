package org.example.Utility;

public class MyQueue {
    MyLinkedList list = new MyLinkedList();

    public void add(int data) {
        this.list.add(data);
    }

    public int poll() {
        if (this.list.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        int result = this.list.get(0);
        this.list.remove(0);
        return result;
    }

    public int peek() {
        if (this.list.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        return this.list.get(0);
    }

    public String toString() {
        return this.list.toString();
    }
}
