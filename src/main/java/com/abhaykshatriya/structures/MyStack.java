package com.abhaykshatriya.structures;

import java.util.EmptyStackException;

public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }
    private StackNode<T> top;

    public void push(T data) {
        StackNode<T> node = new StackNode<>(data);
        node.next = top;
        top = node;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();
        StackNode<T> node = top;
        top = top.next;
        return node.data;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
