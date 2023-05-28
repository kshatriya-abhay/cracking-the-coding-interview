package com.abhaykshatriya.ch02;

import com.abhaykshatriya.structures.Node;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class Question2 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(7);
        System.out.println(head);
        System.out.println("k = 3, " + head.kthToLast(3).getData());
    }
}
