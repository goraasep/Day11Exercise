package org.example.Utility;

public class MyStack {
    private int size;
    private MyLinkedList list = new MyLinkedList();

    public MyStack() {
        this.size = list.size();
    }

    public void push(int data) {
        this.list.add(data);
    }

    public int pop() {
        if (this.list.isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        int data = this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return data;
    }


    public int peek() {
        if (this.list.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        return this.list.get(this.list.size() - 1);
    }


    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int getSize() {
        return this.list.size();
    }

    public void display() {
        System.out.println(this.list.toString());
    }

    public String toString() {
        return this.list.toString();
    }
}
