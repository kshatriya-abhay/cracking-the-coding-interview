package com.abhaykshatriya.structures;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T data) {
        QueueNode<T> node = new QueueNode<>(data);
        if (last != null) {
            last.next = node;
        }
        last = node;
        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        QueueNode<T> n = first;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return n.data;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }
    public boolean isEmpty() {
        return first == null;
    }
}
