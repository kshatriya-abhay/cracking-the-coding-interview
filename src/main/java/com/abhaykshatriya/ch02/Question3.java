package com.abhaykshatriya.ch02;

import com.abhaykshatriya.structures.Node;

/**
 * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 * EXAMPLE
 * Input:the node c from the linked list a -> b -> c -> d -> e -> f
 * Result: nothing is returned, but the new linked list looks like a -> b -> d -> e -> f
 */
public class Question3 {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.appendToTail(2);
        n1.appendToTail(3);
        n1.appendToTail(4);
        System.out.println(n1);
        n1.removeSecondElement();
        System.out.println(n1);
    }
}
