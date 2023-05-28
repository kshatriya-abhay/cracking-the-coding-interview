package com.abhaykshatriya.ch02;

import com.abhaykshatriya.structures.Node;

/**
 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class Question1 {
    public static void main(String[] args) {
        Node head = new Node(0);
        for (int i = 0; i < 5; i++) {
            head.appendToTail(i);
            head.appendToTail(i);
        }
        System.out.println(head);
        head.removeDuplicatesNoBuffer();
//        head.removeDuplicates();
        System.out.println(head);
    }
}
